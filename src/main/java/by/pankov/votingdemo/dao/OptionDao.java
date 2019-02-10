package by.pankov.votingdemo.dao;

import by.pankov.votingdemo.entity.Option;
import org.springframework.data.repository.CrudRepository;

public interface OptionDao extends CrudRepository<Option, Long> {
}
