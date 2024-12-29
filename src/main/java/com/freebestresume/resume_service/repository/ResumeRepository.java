package com.freebestresume.resume_service.repository;

import com.freebestresume.resume_service.constant.CommonVariables;
import com.freebestresume.resume_service.entity.Resume;
import com.freebestresume.resume_service.service.UpdateResumeService;
import com.mongodb.client.result.UpdateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import static org.springframework.data.mongodb.core.query.Criteria.where;

@Repository
public class ResumeRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    public Resume findResume(String id) {
        Query query = new Query(where(CommonVariables.MONGODB_ID).is(id));
        return mongoTemplate.findOne(query, Resume.class);
    }

    public UpdateResult updateResumeProperty(String id, String propertyName, Object resumeDto) {
        Query query = new Query(where(CommonVariables.MONGODB_ID).is(id));
        Update update = new Update().set(propertyName, resumeDto);
        UpdateResult updateResult = mongoTemplate.updateFirst(query, update, Resume.class);
        return updateResult;

    }


    public Resume findResumeById(String id) {
        Query query = new Query(where(CommonVariables.MONGODB_ID).is(id));
        return mongoTemplate.findOne(query, Resume.class);
    }


}
