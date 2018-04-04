package io.faob.utopian.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Sponsor {

    @SerializedName("_id")
    @Expose
    private String id;

    @SerializedName("account")
    @Expose
    private String account;

    @SerializedName("vesting_shares")
    @Expose
    private long vestingShares;

    @SerializedName("percentage_total_vesting_shares")
    @Expose
    private double percentageTotalVestingShares;

    @SerializedName("total_paid_rewards")
    @Expose
    private double totalPaidRewards;

    @SerializedName("should_receive_rewards")
    @Expose
    private double shouldReceiveRewards;

    @SerializedName("is_witness")
    @Expose
    private boolean isWitness;

    @SerializedName("__v")
    @Expose
    private int v = -1;

    @SerializedName("total_paid_rewards_steem")
    @Expose
    private double totalPaidRewardsSteem;

    @SerializedName("projects")
    @Expose
    private List<Project> projects = null;

    @SerializedName("opted_out")
    @Expose
    private boolean optedOut;

    @SerializedName("json_metadata")
    @Expose
    private JsonMetadata jsonMetadata;

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

    public long getVestingShares() {
        return vestingShares;
    }

    public void setVestingShares(long vestingShares) {
        this.vestingShares = vestingShares;
    }

    public double getPercentageTotalVestingShares() {
        return percentageTotalVestingShares;
    }

    public void setPercentageTotalVestingShares(double percentageTotalVestingShares) {
        this.percentageTotalVestingShares = percentageTotalVestingShares;
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

    public boolean isWitness() {
        return isWitness;
    }

    public void setIsWitness(boolean isWitness) {
        this.isWitness = isWitness;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public double getTotalPaidRewardsSteem() {
        return totalPaidRewardsSteem;
    }

    public void setTotalPaidRewardsSteem(double totalPaidRewardsSteem) {
        this.totalPaidRewardsSteem = totalPaidRewardsSteem;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public boolean isOptedOut() {
        return optedOut;
    }

    public void setOptedOut(boolean optedOut) {
        this.optedOut = optedOut;
    }

    public JsonMetadata getJsonMetadata() {
        return jsonMetadata;
    }

    public void setJsonMetadata(JsonMetadata jsonMetadata) {
        this.jsonMetadata = jsonMetadata;
    }

    public class Escrow {

        @SerializedName("fees")
        @Expose
        private Fees fees;

        public Fees getFees() {
            return fees;
        }

        public void setFees(Fees fees) {
            this.fees = fees;
        }

    }

    public class Fees {

        @SerializedName("STEEM")
        @Expose
        private String steem;

        public String getSTEEM() {
            return steem;
        }

        public void setSTEEM(String steem) {
            this.steem = steem;
        }

    }

    public class JsonMetadata {

        @SerializedName("profile")
        @Expose
        private Profile profile;

        @SerializedName("escrow")
        @Expose
        private Escrow escrow;

        public Profile getProfile() {
            return profile;
        }

        public void setProfile(Profile profile) {
            this.profile = profile;
        }

        public Escrow getEscrow() {
            return escrow;
        }

        public void setEscrow(Escrow escrow) {
            this.escrow = escrow;
        }

    }

    public class Profile {

        @SerializedName("name")
        @Expose
        private String name;

        @SerializedName("location")
        @Expose
        private String location;

        @SerializedName("profile_image")
        @Expose
        private String profileImage;

        @SerializedName("cover_image")
        @Expose
        private String coverImage;

        @SerializedName("website")
        @Expose
        private String website;

        @SerializedName("about")
        @Expose
        private String about;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getProfileImage() {
            return profileImage;
        }

        public void setProfileImage(String profileImage) {
            this.profileImage = profileImage;
        }

        public String getCoverImage() {
            return coverImage;
        }

        public void setCoverImage(String coverImage) {
            this.coverImage = coverImage;
        }

        public String getWebsite() {
            return website;
        }

        public void setWebsite(String website) {
            this.website = website;
        }

        public String getAbout() {
            return about;
        }

        public void setAbout(String about) {
            this.about = about;
        }

    }

    public class Project {

        @SerializedName("steem_account")
        @Expose
        private String steemAccount;

        @SerializedName("platform")
        @Expose
        private String platform;

        @SerializedName("external_id")
        @Expose
        private long externalId;

        public String getSteemAccount() {
            return steemAccount;
        }

        public void setSteemAccount(String steemAccount) {
            this.steemAccount = steemAccount;
        }

        public String getPlatform() {
            return platform;
        }

        public void setPlatform(String platform) {
            this.platform = platform;
        }

        public long getExternalId() {
            return externalId;
        }

        public void setExternalId(long externalId) {
            this.externalId = externalId;
        }

    }
}


