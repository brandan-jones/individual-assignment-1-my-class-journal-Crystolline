package edu.uc.cech.soit.myclassjournal.service;

import edu.uc.cech.soit.myclassjournal.dao.IJournalDAO;
import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JournalServiceStub implements IJournalService {
    @Autowired
    private IJournalDAO journalDAO;

    public JournalServiceStub() {

    }

    public JournalServiceStub(IJournalDAO journalDAO) {
        this.journalDAO = journalDAO;
    }

    @Override
    public void save(JournalEntry journalEntry) {
        journalDAO.save(journalEntry);
    }

    @Override
    public List<JournalEntry> fetchAll() {
        return journalDAO.fetchAll();
    }
}
