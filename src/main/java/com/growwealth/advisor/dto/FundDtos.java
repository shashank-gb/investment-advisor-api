package com.growwealth.advisor.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

public class FundDtos {

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class FundCategoryDto {
        private String id;
        private String name;
        private String description;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MutualFundDto {
        private String id;
        private String name;
        private String amc;
        private String category;
        private Double nav;

        @JsonProperty("returns1Y")
        @JsonAlias({"returns_1y", "returns1Y"})
        private Double returns1Y;

        @JsonProperty("returns3Y")
        @JsonAlias({"returns_3y", "returns3Y"})
        private Double returns3Y;

        @JsonProperty("riskLevel")
        @JsonAlias({"risk_level", "riskLevel"})
        private String riskLevel;

        @JsonProperty("minInvestment")
        @JsonAlias({"min_investment", "minInvestment"})
        private Double minInvestment;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class HoldingDto {
        private String name;

        @JsonProperty("companyName")
        @JsonAlias({"company_name", "companyName"})
        private String companyName;

        private Double weightage;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ChartPointDto {
        private String date;
        private Double value;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class FundDetailDto {
        private MutualFundDto fund;
        private String aum;

        @JsonProperty("expenseRatio")
        @JsonAlias({"expense_ratio", "expenseRatio"})
        private String expenseRatio;

        @JsonProperty("exitLoad")
        @JsonAlias({"exit_load", "exitLoad"})
        private String exitLoad;

        @JsonProperty("minSip")
        @JsonAlias({"min_sip", "minSip"})
        private String minSip;

        private List<HoldingDto> holdings;

        @JsonProperty("performanceChart")
        @JsonAlias({"performance_chart", "performanceChart"})
        private List<ChartPointDto> performanceChart;
    }
}
