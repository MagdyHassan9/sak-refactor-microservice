/**
 * 
 */
package com.info.sak.lookup.utils;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author mohatiea
 * @created Jul 15, 2015 - 1:04:06 PM
 */
public final class GenericsUtils {
	public static Class<?> determineType(Field field, Object object) {
	    Class<?> type = object.getClass();
	    return (Class<?>) getType(type, field).type;
	}

	public static List<Field> getAllFields(Class<?> classType) {
        List<Field> fields = new ArrayList<Field>();
        do
        {
        	fields.addAll(Arrays.asList(classType.getDeclaredFields()));
        } while((classType = classType.getSuperclass()) != null);
        return fields;
    }
	
	public static TypeInfo getType(Class<?> clazz, Field field) {
	    TypeInfo type = new TypeInfo(null, null);
	    if (field.getGenericType() instanceof TypeVariable<?>) {
	        TypeVariable<?> genericTyp = (TypeVariable<?>) field.getGenericType();
	        Class<?> superClazz = clazz.getSuperclass();

	        if (clazz.getGenericSuperclass() instanceof ParameterizedType) {
	            ParameterizedType paramType = (ParameterizedType) clazz.getGenericSuperclass();
	            TypeVariable<?>[] superTypeParameters = superClazz.getTypeParameters();
	            if (!Object.class.equals(paramType)) {
	                if (field.getDeclaringClass().equals(superClazz)) {
	                    // this is the root class an starting point for this search
	                    type.name = genericTyp;
	                    type.type = null;
	                } else {
	                    type = getType(superClazz, field);
	                }
	            }
	            if (type.type == null || type.type instanceof TypeVariable<?>) {
	                // lookup if type is not found or type needs a lookup in current concrete class
	                for (int j = 0; j < superClazz.getTypeParameters().length; ++j) {
	                    TypeVariable<?> superTypeParam = superTypeParameters[j];
	                    if (type.name.equals(superTypeParam)) {
	                        type.type = paramType.getActualTypeArguments()[j];
	                        Type[] typeParameters = clazz.getTypeParameters();
	                        if (typeParameters.length > 0) {
	                            for (Type typeParam : typeParameters) {
	                                TypeVariable<?> objectOfComparison = superTypeParam;
	                                if(type.type instanceof TypeVariable<?>) {
	                                    objectOfComparison = (TypeVariable<?>)type.type;
	                                }
	                                if (objectOfComparison.getName().equals(((TypeVariable<?>) typeParam).getName())) {
	                                    type.name = typeParam;
	                                    break;
	                                }
	                            }
	                        }
	                        break;
	                    }
	                }
	            }
	        }
	    } else {
	        type.type = field.getGenericType();
	    }
	    return type;
	}
	
	public static class TypeInfo {
	    private Type type;
	    private Type name;

	    public TypeInfo(Type type, Type name) {
	        this.type = type;
	        this.name = name;
	    }

		/**
		 * @return the type
		 */
		public Type getType() {
			return type;
		}

		/**
		 * @param type the type to set
		 */
		public void setType(Type type) {
			this.type = type;
		}

		/**
		 * @return the name
		 */
		public Type getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(Type name) {
			this.name = name;
		}

	}
}
