package com.rompendo.fe.dto;

import java.time.LocalDate;
import java.util.UUID;

public record IgrejaRecord(UUID id, String culto, LocalDate dataAtual) {
}
