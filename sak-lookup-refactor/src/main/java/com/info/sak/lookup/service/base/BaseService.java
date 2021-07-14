package com.info.sak.lookup.service.base;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import com.info.sak.lookup.entity.base.DomainEntity;
import com.info.sak.lookup.repository.base.BaseRepository;

public abstract class BaseService<entity extends DomainEntity, id extends Serializable> implements Serializable {

    private static final long serialVersionUID = -8567310902296971214L;

    public abstract BaseRepository<id, entity> getBaseRepository();

    public List<entity> listAll() {
        List<entity> entityList = getBaseRepository().findAll();
        return entityList;
    }

    public Boolean deleteEntity(entity e) {
        try {
            getBaseRepository().delete(e);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    public entity updateEntity(entity e) {
        return getBaseRepository().save(e);
    }

    public entity createEntity(entity e) {
        return getBaseRepository().save(e);
    }

    public entity findById(Integer entityId) {
        Optional<entity> optionalEntity = getBaseRepository().findById((id) entityId);
        if (optionalEntity.isPresent()) {
            return optionalEntity.get();
        }
        return null;
    }
}
