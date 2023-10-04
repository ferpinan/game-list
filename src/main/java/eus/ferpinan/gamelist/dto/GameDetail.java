package eus.ferpinan.gamelist.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@EqualsAndHashCode
public class GameDetail {
    @JsonProperty("boxId")
    private String boxId;
    @JsonProperty("boxName")
    private String boxName;
    @JsonProperty("categoryId")
    private Integer categoryId;
    @JsonProperty("categoryName")
    private String categoryName;
    @JsonProperty("categoryFriendlyName")
    private String categoryFriendlyName;
    @JsonProperty("superCatId")
    private Integer superCatId;
    @JsonProperty("superCatName")
    private String superCatName;
    @JsonProperty("superCatFriendlyName")
    private String superCatFriendlyName;
    @JsonProperty("cannotBuy")
    private Integer cannotBuy;
    @JsonProperty("isNewBox")
    private Integer isNewBox;
    @JsonProperty("cashPrice")
    private Integer cashPrice;
    @JsonProperty("exchangePrice")
    private Integer exchangePrice;
    @JsonProperty("sellPrice")
    private Integer sellPrice;
    @JsonProperty("firstPrice")
    private Integer firstPrice;
    @JsonProperty("previousPrice")
    private Integer previousPrice;
    @JsonProperty("lastPriceUpdatedDate")
    private String lastPriceUpdatedDate;
    @JsonProperty("boxRating")
    private Double boxRating;
    @JsonProperty("collectionQuantity")
    private Integer collectionQuantity;
    @JsonProperty("outOfStock")
    private Integer outOfStock;
    @JsonProperty("ecomQuantityOnHand")
    private Integer ecomQuantityOnHand;
    @JsonProperty("webSellAllowed")
    private Integer webSellAllowed;
    @JsonProperty("webBuyAllowed")
    private Integer webBuyAllowed;
    @JsonProperty("webShowSellPrice")
    private Integer webShowSellPrice;
    @JsonProperty("webShowBuyPrice")
    private Integer webShowBuyPrice;
    @JsonProperty("boxSaleAllowed")
    private Integer boxSaleAllowed;
    @JsonProperty("boxBuyAllowed")
    private Integer boxBuyAllowed;
    @JsonProperty("boxWebSaleAllowed")
    private Integer boxWebSaleAllowed;
    @JsonProperty("boxWebBuyAllowed")
    private Integer boxWebBuyAllowed;
    @JsonProperty("imageUrls")
    private ImageUrls imageUrls;
    @JsonProperty("isMasterBox")
    private Integer isMasterBox;
    @JsonProperty("boxDescription")
    private String boxDescription;
    @JsonProperty("operatorId")
    private Object operatorId;
    @JsonProperty("gradeId")
    private Object gradeId;
    @JsonProperty("productGuide")
    private Object productGuide;
    @JsonProperty("boxRatingText")
    private Object boxRatingText;
    @JsonProperty("attributeDetails")
    private Object attributeDetails;
    @JsonProperty("variantGroupValue")
    private Object variantGroupValue;
    @JsonProperty("displayableBoxAttributes")
    private Object displayableBoxAttributes;
    @JsonProperty("attributeInfo")
    private Object attributeInfo;
    @JsonProperty("imageNames")
    private Object imageNames;
    @JsonProperty("isImageTypeInternal")
    private Object isImageTypeInternal;

    // getters and setters
}
