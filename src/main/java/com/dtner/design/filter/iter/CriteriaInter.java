package com.dtner.design.filter.iter;

import com.dtner.design.filter.domain.Person;

import java.util.List;

/**
 * @InterfaceName CriteriaInter
 * @Description: TODO
 * @Author dt
 * @Date 2020-07-30
 **/
public interface CriteriaInter {

    List<Person> meetCriteria(List<Person> persons);

}
