package com.wmachaca.airbnbclone.listing.application.dto;

import com.wmachaca.airbnbclone.listing.application.dto.sub.DescriptionDTO;
import com.wmachaca.airbnbclone.listing.application.dto.sub.LandlordListingDTO;
import com.wmachaca.airbnbclone.listing.application.dto.sub.ListingInfoDTO;
import com.wmachaca.airbnbclone.listing.application.dto.sub.PictureDTO;
import com.wmachaca.airbnbclone.listing.application.dto.vo.PriceVO;
import com.wmachaca.airbnbclone.listing.domain.BookingCategory;

import java.util.List;

public class DisplayListingDTO {

    private DescriptionDTO description;
    private List<PictureDTO> pictures;
    private ListingInfoDTO infos;
    private PriceVO price;
    private BookingCategory category;
    private String location;
    private LandlordListingDTO landlord;

    public DescriptionDTO getDescription() {
        return description;
    }

    public void setDescription(DescriptionDTO description) {
        this.description = description;
    }

    public List<PictureDTO> getPictures() {
        return pictures;
    }

    public void setPictures(List<PictureDTO> pictures) {
        this.pictures = pictures;
    }

    public ListingInfoDTO getInfos() {
        return infos;
    }

    public void setInfos(ListingInfoDTO infos) {
        this.infos = infos;
    }

    public PriceVO getPrice() {
        return price;
    }

    public void setPrice(PriceVO price) {
        this.price = price;
    }

    public BookingCategory getCategory() {
        return category;
    }

    public void setCategory(BookingCategory category) {
        this.category = category;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LandlordListingDTO getLandlord() {
        return landlord;
    }

    public void setLandlord(LandlordListingDTO landlord) {
        this.landlord = landlord;
    }
}
