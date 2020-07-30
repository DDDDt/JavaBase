package com.dtner.design.filter.impl;

import com.dtner.design.filter.domain.Person;
import com.dtner.design.filter.iter.CriteriaInter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CriteriaMaleImpl
 * @Description: 过滤器过滤
 * @Author dt
 * @Date 2020-07-30
 **/
public class CriteriaMaleImpl implements CriteriaInter {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        persons.forEach(x -> {
            if(x.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(x);
            }
        });
        return malePersons;
    }
}
