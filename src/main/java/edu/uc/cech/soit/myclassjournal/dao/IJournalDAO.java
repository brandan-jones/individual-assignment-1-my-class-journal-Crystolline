package edu.uc.cech.soit.myclassjournal.dao;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;

import java.util.List;

public interface IJournalDAO {
    void save(JournalEntry journalEntry);

    List<JournalEntry> fetchAll();
}
