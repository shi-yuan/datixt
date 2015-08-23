package com.datixt.model;

public class Answer {
    /**
     * 选项标号
     */
    private String optionId;

    /**
     * 选项内容
     */
    private String optionContent;

    private Integer orderId;

    public String getOptionId() {
        return optionId;
    }

    public void setOptionId(String optionId) {
        this.optionId = optionId;
    }

    public String getOptionContent() {
        return optionContent;
    }

    public void setOptionContent(String optionContent) {
        this.optionContent = optionContent;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}
