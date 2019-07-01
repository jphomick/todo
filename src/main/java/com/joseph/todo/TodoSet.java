package com.joseph.todo;

import org.springframework.data.repository.CrudRepository;

public interface TodoSet extends CrudRepository<Todo, Long>{
}
