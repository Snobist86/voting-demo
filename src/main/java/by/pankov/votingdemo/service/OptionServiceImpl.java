package by.pankov.votingdemo.service;

import by.pankov.votingdemo.dao.OptionDao;
import by.pankov.votingdemo.entity.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OptionServiceImpl {

    private final OptionDao optionDao;

    @Autowired
    public OptionServiceImpl(OptionDao optionDao) {
        this.optionDao = optionDao;
    }

    public void save(Option option) {
        optionDao.save(option);
    }

    public Option findById(Long id) {
        return optionDao.findById(id).orElse(null);
    }
}
