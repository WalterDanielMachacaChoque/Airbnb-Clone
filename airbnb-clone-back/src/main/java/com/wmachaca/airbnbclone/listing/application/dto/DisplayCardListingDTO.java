package com.wmachaca.airbnbclone.listing.application.dto;

import com.wmachaca.airbnbclone.listing.application.dto.sub.PictureDTO;
import com.wmachaca.airbnbclone.listing.application.dto.vo.PriceVO;
import com.wmachaca.airbnbclone.listing.domain.BookingCategory;

import java.util.UUID;

public record DisplayCardListingDTO(PriceVO price,
                                    String location,
                                    PictureDTO cover,
                                    BookingCategory bookingCategory,
                                    UUID publicId) {
}
