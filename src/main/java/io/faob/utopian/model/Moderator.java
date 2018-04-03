package io.faob.utopian.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Moderator {

    @SerializedName("_id")
    @Expose
    private String id;

    @SerializedName("account")
    @Expose
    private String account;

    @SerializedName("total_paid_rewards")
    @Expose
    private double totalPaidRewards;

    @SerializedName("should_receive_rewards")
    @Expose
    private double shouldReceiveRewards;

    @SerializedName("total_moderated")
    @Expose
    private long totalModerated;

    @SerializedName("percentage_total_rewards_moderators")
    @Expose
    private double percentageTotalRewardsModerators;

    @SerializedName("banned")
    @Expose
    private boolean banned;

    @SerializedName("reviewed")
    @Expose
    private boolean reviewed;

    @SerializedName("supermoderator")
    @Expose
    private boolean supermoderator;

    @SerializedName("total_paid_rewards_steem")
    @Expose
    private double totalPaidRewardsSteem;

    @SerializedName("referrer")
    @Expose
    private String referrer;

    @SerializedName("apprentice")
    @Expose
    private boolean apprentice;

    @SerializedName("__v")
    @Expose
    private int v = -1;

    @SerializedName("opetout")
    @Expose
    private boolean opetout;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getTotalPaidRewards() {
        return totalPaidRewards;
    }

    public void setTotalPaidRewards(double totalPaidRewards) {
        this.totalPaidRewards = totalPaidRewards;
    }

    public double getShouldReceiveRewards() {
        return shouldReceiveRewards;
    }

    public void setShouldReceiveRewards(double shouldReceiveRewards) {
        this.shouldReceiveRewards = shouldReceiveRewards;
    }

    public long getTotalModerated() {
        return totalModerated;
    }

    public void setTotalModerated(long totalModerated) {
        this.totalModerated = totalModerated;
    }

    public double getPercentageTotalRewardsModerators() {
        return percentageTotalRewardsModerators;
    }

    public void setPercentageTotalRewardsModerators(double percentageTotalRewardsModerators) {
        this.percentageTotalRewardsModerators = percentageTotalRewardsModerators;
    }

    public boolean isBanned() {
        return banned;
    }

    public void setBanned(boolean banned) {
        this.banned = banned;
    }

    public boolean isReviewed() {
        return reviewed;
    }

    public void setReviewed(boolean reviewed) {
        this.reviewed = reviewed;
    }

    public boolean isSupermoderator() {
        return supermoderator;
    }

    public void setSupermoderator(boolean supermoderator) {
        this.supermoderator = supermoderator;
    }

    public double getTotalPaidRewardsSteem() {
        return totalPaidRewardsSteem;
    }

    public void setTotalPaidRewardsSteem(double totalPaidRewardsSteem) {
        this.totalPaidRewardsSteem = totalPaidRewardsSteem;
    }

    public String getReferrer() {
        return referrer;
    }

    public void setReferrer(String referrer) {
        this.referrer = referrer;
    }

    public boolean isApprentice() {
        return apprentice;
    }

    public void setApprentice(boolean apprentice) {
        this.apprentice = apprentice;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public boolean isOpetout() {
        return opetout;
    }

    public void setOpetout(boolean opetout) {
        this.opetout = opetout;
    }

}
