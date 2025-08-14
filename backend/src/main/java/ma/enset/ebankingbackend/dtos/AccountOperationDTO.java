package ma.enset.digital-bankingbackend.dtos;

import lombok.Data;
import ma.enset.digital-bankingbackend.enums.OperationType;

import java.util.Date;

@Data
public class AccountOperationDTO {
    private String id;
    private Date operationDate;
    private double amount;
    private OperationType type;
    private String description;
    private boolean cancelled;
}
