package com.vincenzoracca.springoauth2client.listener;

import com.hazelcast.core.EntryEvent;
import com.hazelcast.core.EntryListener;
import com.hazelcast.map.MapEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.session.Session;

public class SessionHazelcastListener implements EntryListener<String, Session> {

    private static final Logger log = LoggerFactory.getLogger(SessionHazelcastListener.class);

    @Override
    public void entryAdded(EntryEvent<String, Session> event) {
        log.info("Added new session, key: {}", event.getKey());
    }

    @Override
    public void entryEvicted(EntryEvent<String, Session> event) {

    }

    @Override
    public void entryExpired(EntryEvent<String, Session> event) {
        log.info("Expired session, key: {}", event.getKey());
    }

    @Override
    public void entryRemoved(EntryEvent<String, Session> event) {
        log.info("Delete session, key: {}", event.getKey());
    }

    @Override
    public void entryUpdated(EntryEvent<String, Session> event) {
        log.info("Update session, key: {}", event.getKey());
    }

    @Override
    public void mapCleared(MapEvent event) {

    }

    @Override
    public void mapEvicted(MapEvent event) {

    }
}
