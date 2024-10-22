package com.wmachaca.airbnbclone.listing.application.dto;

import com.wmachaca.airbnbclone.booking.application.dto.BookedDateDTO;
import com.wmachaca.airbnbclone.listing.application.dto.sub.ListingInfoDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;

public record SearchDTO(@Valid BookedDateDTO dates,
                        @Valid ListingInfoDTO infos,
                        @NotEmpty String location) {
}
