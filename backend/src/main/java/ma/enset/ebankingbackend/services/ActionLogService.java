package ma.enset.digital-bankingbackend.services;

import ma.enset.digital-bankingbackend.entities.ActionLog;

import java.util.List;

public interface ActionLogService {

    void log(String username, String action, String description);

    List<ActionLog> searchLogs(String username, String action);
}
