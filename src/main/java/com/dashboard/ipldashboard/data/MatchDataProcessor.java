package com.dashboard.ipldashboard.data;


import org.springframework.batch.item.ItemProcessor;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.dashboard.ipldashboard.model.Match;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MatchDataProcessor implements ItemProcessor<MatchInput,Match> {
    private static final Logger log = LoggerFactory.getLogger(MatchDataProcessor.class);

  @Override
  public Match process(final MatchInput matchInput) throws Exception {
    Match match=new Match();
    match.setId(Long.parseLong(matchInput.getId()));
    match.setCity(matchInput.getCity());
    match.setDate(LocalDate.parse(matchInput.getDate()));
    match.setPlayerOfMatch(matchInput.getPlayer_of_match());
    match.setVenue(matchInput.getVenue());
    
    return match;
  }
}





