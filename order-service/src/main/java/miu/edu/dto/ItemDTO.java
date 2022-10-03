package miu.edu.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ItemDTO {
    private Long productId;
    private Double price;
    private LocalDate startDate;
    private LocalDate endDate;
}
