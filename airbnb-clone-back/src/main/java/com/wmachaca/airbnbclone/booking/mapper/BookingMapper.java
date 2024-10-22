package com.wmachaca.airbnbclone.booking.mapper;

import com.wmachaca.airbnbclone.booking.application.dto.BookedDateDTO;
import com.wmachaca.airbnbclone.booking.application.dto.NewBookingDTO;
import com.wmachaca.airbnbclone.booking.domain.Booking;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookingMapper {

    Booking newBookingToBooking(NewBookingDTO newBookingDTO);

    BookedDateDTO bookingToCheckAvailability(Booking booking);
}
