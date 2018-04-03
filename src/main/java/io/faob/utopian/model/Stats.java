package io.faob.utopian.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stats {

    @SerializedName("_id")
    @Expose
    private String id;

    @SerializedName("total_paid_rewards")
    @Expose
    private double totalPaidRewards;

    @SerializedName("total_pending_rewards")
    @Expose
    private double totalPendingRewards;

    @SerializedName("total_paid_authors")
    @Expose
    private double totalPaidAuthors;

    @SerializedName("total_paid_curators")
    @Expose
    private double totalPaidCurators;

    @SerializedName("__v")
    @Expose
    private int v = -1;

    @SerializedName("stats_moderator_shares_last_check")
    @Expose
    private String statsModeratorSharesLastCheck;

    @SerializedName("stats_sponsors_shares_last_check")
    @Expose
    private String statsSponsorsSharesLastCheck;

    @SerializedName("stats_total_pending_last_check")
    @Expose
    private String statsTotalPendingLastCheck;

    @SerializedName("stats_total_paid_last_check")
    @Expose
    private String statsTotalPaidLastCheck;

    @SerializedName("stats_paid_moderators_last_check")
    @Expose
    private String statsPaidModeratorsLastCheck;

    @SerializedName("stats_paid_sponsors_last_check")
    @Expose
    private String statsPaidSponsorsLastCheck;

    @SerializedName("stats_categories_last_check")
    @Expose
    private String statsCategoriesLastCheck;

    @SerializedName("stats_last_updated_posts")
    @Expose
    private String statsLastUpdatedPosts;

    @SerializedName("bot_is_voting")
    @Expose
    private boolean botIsVoting;

    @SerializedName("last_limit_comment_benefactor")
    @Expose
    private int lastLimitCommentBenefactor;

    @SerializedName("stats_total_pending_last_post_date")
    @Expose
    private String statsTotalPendingLastPostDate;

    @SerializedName("stats_total_paid_last_post_date")
    @Expose
    private String statsTotalPaidLastPostDate;

    @SerializedName("stats_total_moderated")
    @Expose
    private int statsTotalModerated;

    @SerializedName("last_date_edit_privacy")
    @Expose
    private String lastDateEditPrivacy;

    @SerializedName("last_date_edit_tos")
    @Expose
    private String lastDateEditTos;

    @SerializedName("categories")
    @Expose
    private Categories categories;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTotalPaidRewards() {
        return totalPaidRewards;
    }

    public void setTotalPaidRewards(double totalPaidRewards) {
        this.totalPaidRewards = totalPaidRewards;
    }

    public double getTotalPendingRewards() {
        return totalPendingRewards;
    }

    public void setTotalPendingRewards(double totalPendingRewards) {
        this.totalPendingRewards = totalPendingRewards;
    }

    public double getTotalPaidAuthors() {
        return totalPaidAuthors;
    }

    public void setTotalPaidAuthors(double totalPaidAuthors) {
        this.totalPaidAuthors = totalPaidAuthors;
    }

    public double getTotalPaidCurators() {
        return totalPaidCurators;
    }

    public void setTotalPaidCurators(double totalPaidCurators) {
        this.totalPaidCurators = totalPaidCurators;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public String getStatsModeratorSharesLastCheck() {
        return statsModeratorSharesLastCheck;
    }

    public void setStatsModeratorSharesLastCheck(String statsModeratorSharesLastCheck) {
        this.statsModeratorSharesLastCheck = statsModeratorSharesLastCheck;
    }

    public String getStatsSponsorsSharesLastCheck() {
        return statsSponsorsSharesLastCheck;
    }

    public void setStatsSponsorsSharesLastCheck(String statsSponsorsSharesLastCheck) {
        this.statsSponsorsSharesLastCheck = statsSponsorsSharesLastCheck;
    }

    public String getStatsTotalPendingLastCheck() {
        return statsTotalPendingLastCheck;
    }

    public void setStatsTotalPendingLastCheck(String statsTotalPendingLastCheck) {
        this.statsTotalPendingLastCheck = statsTotalPendingLastCheck;
    }

    public String getStatsTotalPaidLastCheck() {
        return statsTotalPaidLastCheck;
    }

    public void setStatsTotalPaidLastCheck(String statsTotalPaidLastCheck) {
        this.statsTotalPaidLastCheck = statsTotalPaidLastCheck;
    }

    public String getStatsPaidModeratorsLastCheck() {
        return statsPaidModeratorsLastCheck;
    }

    public void setStatsPaidModeratorsLastCheck(String statsPaidModeratorsLastCheck) {
        this.statsPaidModeratorsLastCheck = statsPaidModeratorsLastCheck;
    }

    public String getStatsPaidSponsorsLastCheck() {
        return statsPaidSponsorsLastCheck;
    }

    public void setStatsPaidSponsorsLastCheck(String statsPaidSponsorsLastCheck) {
        this.statsPaidSponsorsLastCheck = statsPaidSponsorsLastCheck;
    }

    public String getStatsCategoriesLastCheck() {
        return statsCategoriesLastCheck;
    }

    public void setStatsCategoriesLastCheck(String statsCategoriesLastCheck) {
        this.statsCategoriesLastCheck = statsCategoriesLastCheck;
    }

    public String getStatsLastUpdatedPosts() {
        return statsLastUpdatedPosts;
    }

    public void setStatsLastUpdatedPosts(String statsLastUpdatedPosts) {
        this.statsLastUpdatedPosts = statsLastUpdatedPosts;
    }

    public boolean isBotIsVoting() {
        return botIsVoting;
    }

    public void setBotIsVoting(boolean botIsVoting) {
        this.botIsVoting = botIsVoting;
    }

    public int getLastLimitCommentBenefactor() {
        return lastLimitCommentBenefactor;
    }

    public void setLastLimitCommentBenefactor(int lastLimitCommentBenefactor) {
        this.lastLimitCommentBenefactor = lastLimitCommentBenefactor;
    }

    public String getStatsTotalPendingLastPostDate() {
        return statsTotalPendingLastPostDate;
    }

    public void setStatsTotalPendingLastPostDate(String statsTotalPendingLastPostDate) {
        this.statsTotalPendingLastPostDate = statsTotalPendingLastPostDate;
    }

    public String getStatsTotalPaidLastPostDate() {
        return statsTotalPaidLastPostDate;
    }

    public void setStatsTotalPaidLastPostDate(String statsTotalPaidLastPostDate) {
        this.statsTotalPaidLastPostDate = statsTotalPaidLastPostDate;
    }

    public int getStatsTotalModerated() {
        return statsTotalModerated;
    }

    public void setStatsTotalModerated(int statsTotalModerated) {
        this.statsTotalModerated = statsTotalModerated;
    }

    public String getLastDateEditPrivacy() {
        return lastDateEditPrivacy;
    }

    public void setLastDateEditPrivacy(String lastDateEditPrivacy) {
        this.lastDateEditPrivacy = lastDateEditPrivacy;
    }

    public String getLastDateEditTos() {
        return lastDateEditTos;
    }

    public void setLastDateEditTos(String lastDateEditTos) {
        this.lastDateEditTos = lastDateEditTos;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public class Analysis {

        @SerializedName("average_tags_per_post")
        @Expose
        private double averageTagsPerPost;

        @SerializedName("total_tags")
        @Expose
        private int totalTags;

        @SerializedName("average_links_per_post")
        @Expose
        private double averageLinksPerPost;

        @SerializedName("total_links")
        @Expose
        private int totalLinks;

        @SerializedName("average_images_per_post")
        @Expose
        private double averageImagesPerPost;

        @SerializedName("total_images")
        @Expose
        private int totalImages;

        @SerializedName("average_posts_length")
        @Expose
        private double averagePostsLength;

        @SerializedName("total_posts_length")
        @Expose
        private int totalPostsLength;

        @SerializedName("average_paid_curators")
        @Expose
        private double averagePaidCurators;

        @SerializedName("total_paid_curators")
        @Expose
        private double totalPaidCurators;

        @SerializedName("average_paid_authors")
        @Expose
        private double averagePaidAuthors;

        @SerializedName("total_paid_authors")
        @Expose
        private double totalPaidAuthors;

        @SerializedName("total_paid")
        @Expose
        private double totalPaid;

        @SerializedName("average_likes_per_post")
        @Expose
        private double averageLikesPerPost;

        @SerializedName("total_likes")
        @Expose
        private int totalLikes;

        @SerializedName("total_posts")
        @Expose
        private int totalPosts;

        public double getAverageTagsPerPost() {
            return averageTagsPerPost;
        }

        public void setAverageTagsPerPost(double averageTagsPerPost) {
            this.averageTagsPerPost = averageTagsPerPost;
        }

        public int getTotalTags() {
            return totalTags;
        }

        public void setTotalTags(int totalTags) {
            this.totalTags = totalTags;
        }

        public double getAverageLinksPerPost() {
            return averageLinksPerPost;
        }

        public void setAverageLinksPerPost(double averageLinksPerPost) {
            this.averageLinksPerPost = averageLinksPerPost;
        }

        public int getTotalLinks() {
            return totalLinks;
        }

        public void setTotalLinks(int totalLinks) {
            this.totalLinks = totalLinks;
        }

        public double getAverageImagesPerPost() {
            return averageImagesPerPost;
        }

        public void setAverageImagesPerPost(double averageImagesPerPost) {
            this.averageImagesPerPost = averageImagesPerPost;
        }

        public int getTotalImages() {
            return totalImages;
        }

        public void setTotalImages(int totalImages) {
            this.totalImages = totalImages;
        }

        public double getAveragePostsLength() {
            return averagePostsLength;
        }

        public void setAveragePostsLength(double averagePostsLength) {
            this.averagePostsLength = averagePostsLength;
        }

        public int getTotalPostsLength() {
            return totalPostsLength;
        }

        public void setTotalPostsLength(int totalPostsLength) {
            this.totalPostsLength = totalPostsLength;
        }

        public double getAveragePaidCurators() {
            return averagePaidCurators;
        }

        public void setAveragePaidCurators(double averagePaidCurators) {
            this.averagePaidCurators = averagePaidCurators;
        }

        public double getTotalPaidCurators() {
            return totalPaidCurators;
        }

        public void setTotalPaidCurators(double totalPaidCurators) {
            this.totalPaidCurators = totalPaidCurators;
        }

        public double getAveragePaidAuthors() {
            return averagePaidAuthors;
        }

        public void setAveragePaidAuthors(double averagePaidAuthors) {
            this.averagePaidAuthors = averagePaidAuthors;
        }

        public double getTotalPaidAuthors() {
            return totalPaidAuthors;
        }

        public void setTotalPaidAuthors(double totalPaidAuthors) {
            this.totalPaidAuthors = totalPaidAuthors;
        }

        public double getTotalPaid() {
            return totalPaid;
        }

        public void setTotalPaid(double totalPaid) {
            this.totalPaid = totalPaid;
        }

        public double getAverageLikesPerPost() {
            return averageLikesPerPost;
        }

        public void setAverageLikesPerPost(double averageLikesPerPost) {
            this.averageLikesPerPost = averageLikesPerPost;
        }

        public int getTotalLikes() {
            return totalLikes;
        }

        public void setTotalLikes(int totalLikes) {
            this.totalLikes = totalLikes;
        }

        public int getTotalPosts() {
            return totalPosts;
        }

        public void setTotalPosts(int totalPosts) {
            this.totalPosts = totalPosts;
        }

    }

    public class Blog {

        @SerializedName("average_tags_per_post")
        @Expose
        private double averageTagsPerPost;

        @SerializedName("total_tags")
        @Expose
        private int totalTags;

        @SerializedName("average_links_per_post")
        @Expose
        private double averageLinksPerPost;

        @SerializedName("total_links")
        @Expose
        private int totalLinks;

        @SerializedName("average_images_per_post")
        @Expose
        private double averageImagesPerPost;

        @SerializedName("total_images")
        @Expose
        private int totalImages;

        @SerializedName("average_posts_length")
        @Expose
        private double averagePostsLength;

        @SerializedName("total_posts_length")
        @Expose
        private int totalPostsLength;

        @SerializedName("average_paid_curators")
        @Expose
        private double averagePaidCurators;

        @SerializedName("total_paid_curators")
        @Expose
        private double totalPaidCurators;

        @SerializedName("average_paid_authors")
        @Expose
        private double averagePaidAuthors;

        @SerializedName("total_paid_authors")
        @Expose
        private double totalPaidAuthors;

        @SerializedName("total_paid")
        @Expose
        private double totalPaid;

        @SerializedName("average_likes_per_post")
        @Expose
        private double averageLikesPerPost;

        @SerializedName("total_likes")
        @Expose
        private int totalLikes;

        @SerializedName("total_posts")
        @Expose
        private int totalPosts;

        public double getAverageTagsPerPost() {
            return averageTagsPerPost;
        }

        public void setAverageTagsPerPost(double averageTagsPerPost) {
            this.averageTagsPerPost = averageTagsPerPost;
        }

        public int getTotalTags() {
            return totalTags;
        }

        public void setTotalTags(int totalTags) {
            this.totalTags = totalTags;
        }

        public double getAverageLinksPerPost() {
            return averageLinksPerPost;
        }

        public void setAverageLinksPerPost(double averageLinksPerPost) {
            this.averageLinksPerPost = averageLinksPerPost;
        }

        public int getTotalLinks() {
            return totalLinks;
        }

        public void setTotalLinks(int totalLinks) {
            this.totalLinks = totalLinks;
        }

        public double getAverageImagesPerPost() {
            return averageImagesPerPost;
        }

        public void setAverageImagesPerPost(double averageImagesPerPost) {
            this.averageImagesPerPost = averageImagesPerPost;
        }

        public int getTotalImages() {
            return totalImages;
        }

        public void setTotalImages(int totalImages) {
            this.totalImages = totalImages;
        }

        public double getAveragePostsLength() {
            return averagePostsLength;
        }

        public void setAveragePostsLength(double averagePostsLength) {
            this.averagePostsLength = averagePostsLength;
        }

        public int getTotalPostsLength() {
            return totalPostsLength;
        }

        public void setTotalPostsLength(int totalPostsLength) {
            this.totalPostsLength = totalPostsLength;
        }

        public double getAveragePaidCurators() {
            return averagePaidCurators;
        }

        public void setAveragePaidCurators(double averagePaidCurators) {
            this.averagePaidCurators = averagePaidCurators;
        }

        public double getTotalPaidCurators() {
            return totalPaidCurators;
        }

        public void setTotalPaidCurators(double totalPaidCurators) {
            this.totalPaidCurators = totalPaidCurators;
        }

        public double getAveragePaidAuthors() {
            return averagePaidAuthors;
        }

        public void setAveragePaidAuthors(double averagePaidAuthors) {
            this.averagePaidAuthors = averagePaidAuthors;
        }

        public double getTotalPaidAuthors() {
            return totalPaidAuthors;
        }

        public void setTotalPaidAuthors(double totalPaidAuthors) {
            this.totalPaidAuthors = totalPaidAuthors;
        }

        public double getTotalPaid() {
            return totalPaid;
        }

        public void setTotalPaid(double totalPaid) {
            this.totalPaid = totalPaid;
        }

        public double getAverageLikesPerPost() {
            return averageLikesPerPost;
        }

        public void setAverageLikesPerPost(double averageLikesPerPost) {
            this.averageLikesPerPost = averageLikesPerPost;
        }

        public int getTotalLikes() {
            return totalLikes;
        }

        public void setTotalLikes(int totalLikes) {
            this.totalLikes = totalLikes;
        }

        public int getTotalPosts() {
            return totalPosts;
        }

        public void setTotalPosts(int totalPosts) {
            this.totalPosts = totalPosts;
        }

    }

    public class BugHunting {

        @SerializedName("average_tags_per_post")
        @Expose
        private double averageTagsPerPost;

        @SerializedName("total_tags")
        @Expose
        private int totalTags;

        @SerializedName("average_links_per_post")
        @Expose
        private double averageLinksPerPost;

        @SerializedName("total_links")
        @Expose
        private int totalLinks;

        @SerializedName("average_images_per_post")
        @Expose
        private double averageImagesPerPost;

        @SerializedName("total_images")
        @Expose
        private int totalImages;

        @SerializedName("average_posts_length")
        @Expose
        private double averagePostsLength;

        @SerializedName("total_posts_length")
        @Expose
        private int totalPostsLength;

        @SerializedName("average_paid_curators")
        @Expose
        private double averagePaidCurators;

        @SerializedName("total_paid_curators")
        @Expose
        private double totalPaidCurators;

        @SerializedName("average_paid_authors")
        @Expose
        private double averagePaidAuthors;

        @SerializedName("total_paid_authors")
        @Expose
        private double totalPaidAuthors;

        @SerializedName("total_paid")
        @Expose
        private double totalPaid;

        @SerializedName("average_likes_per_post")
        @Expose
        private double averageLikesPerPost;

        @SerializedName("total_likes")
        @Expose
        private int totalLikes;

        @SerializedName("total_posts")
        @Expose
        private int totalPosts;

        public double getAverageTagsPerPost() {
            return averageTagsPerPost;
        }

        public void setAverageTagsPerPost(double averageTagsPerPost) {
            this.averageTagsPerPost = averageTagsPerPost;
        }

        public int getTotalTags() {
            return totalTags;
        }

        public void setTotalTags(int totalTags) {
            this.totalTags = totalTags;
        }

        public double getAverageLinksPerPost() {
            return averageLinksPerPost;
        }

        public void setAverageLinksPerPost(double averageLinksPerPost) {
            this.averageLinksPerPost = averageLinksPerPost;
        }

        public int getTotalLinks() {
            return totalLinks;
        }

        public void setTotalLinks(int totalLinks) {
            this.totalLinks = totalLinks;
        }

        public double getAverageImagesPerPost() {
            return averageImagesPerPost;
        }

        public void setAverageImagesPerPost(double averageImagesPerPost) {
            this.averageImagesPerPost = averageImagesPerPost;
        }

        public int getTotalImages() {
            return totalImages;
        }

        public void setTotalImages(int totalImages) {
            this.totalImages = totalImages;
        }

        public double getAveragePostsLength() {
            return averagePostsLength;
        }

        public void setAveragePostsLength(double averagePostsLength) {
            this.averagePostsLength = averagePostsLength;
        }

        public int getTotalPostsLength() {
            return totalPostsLength;
        }

        public void setTotalPostsLength(int totalPostsLength) {
            this.totalPostsLength = totalPostsLength;
        }

        public double getAveragePaidCurators() {
            return averagePaidCurators;
        }

        public void setAveragePaidCurators(double averagePaidCurators) {
            this.averagePaidCurators = averagePaidCurators;
        }

        public double getTotalPaidCurators() {
            return totalPaidCurators;
        }

        public void setTotalPaidCurators(double totalPaidCurators) {
            this.totalPaidCurators = totalPaidCurators;
        }

        public double getAveragePaidAuthors() {
            return averagePaidAuthors;
        }

        public void setAveragePaidAuthors(double averagePaidAuthors) {
            this.averagePaidAuthors = averagePaidAuthors;
        }

        public double getTotalPaidAuthors() {
            return totalPaidAuthors;
        }

        public void setTotalPaidAuthors(double totalPaidAuthors) {
            this.totalPaidAuthors = totalPaidAuthors;
        }

        public double getTotalPaid() {
            return totalPaid;
        }

        public void setTotalPaid(double totalPaid) {
            this.totalPaid = totalPaid;
        }

        public double getAverageLikesPerPost() {
            return averageLikesPerPost;
        }

        public void setAverageLikesPerPost(double averageLikesPerPost) {
            this.averageLikesPerPost = averageLikesPerPost;
        }

        public int getTotalLikes() {
            return totalLikes;
        }

        public void setTotalLikes(int totalLikes) {
            this.totalLikes = totalLikes;
        }

        public int getTotalPosts() {
            return totalPosts;
        }

        public void setTotalPosts(int totalPosts) {
            this.totalPosts = totalPosts;
        }

    }

    public class Categories {

        @SerializedName("blog")
        @Expose
        private Blog blog;

        @SerializedName("task-social")
        @Expose
        private TaskSocial taskSocial;

        @SerializedName("task-documentation")
        @Expose
        private TaskDocumentation taskDocumentation;

        @SerializedName("task-graphics")
        @Expose
        private TaskGraphics taskGraphics;

        @SerializedName("task-translations")
        @Expose
        private TaskTranslations taskTranslations;

        @SerializedName("task-bug-hunting")
        @Expose
        private TaskBugHunting taskBugHunting;

        @SerializedName("task-development")
        @Expose
        private TaskDevelopment taskDevelopment;

        @SerializedName("task-ideas")
        @Expose
        private TaskIdeas taskIdeas;

        @SerializedName("social")
        @Expose
        private Social social;

        @SerializedName("analysis")
        @Expose
        private Analysis analysis;

        @SerializedName("tutorials")
        @Expose
        private Tutorials tutorials;

        @SerializedName("video-tutorials")
        @Expose
        private VideoTutorials videoTutorials;

        @SerializedName("copywriting")
        @Expose
        private Copywriting copywriting;

        @SerializedName("documentation")
        @Expose
        private Documentation documentation;

        @SerializedName("graphics")
        @Expose
        private Graphics graphics;

        @SerializedName("translations")
        @Expose
        private Translations translations;

        @SerializedName("bug-hunting")
        @Expose
        private BugHunting bugHunting;

        @SerializedName("development")
        @Expose
        private Development development;

        @SerializedName("sub-projects")
        @Expose
        private SubProjects subProjects;

        @SerializedName("ideas")
        @Expose
        private Ideas ideas;

        public Blog getBlog() {
            return blog;
        }

        public void setBlog(Blog blog) {
            this.blog = blog;
        }

        public TaskSocial getTaskSocial() {
            return taskSocial;
        }

        public void setTaskSocial(TaskSocial taskSocial) {
            this.taskSocial = taskSocial;
        }

        public TaskDocumentation getTaskDocumentation() {
            return taskDocumentation;
        }

        public void setTaskDocumentation(TaskDocumentation taskDocumentation) {
            this.taskDocumentation = taskDocumentation;
        }

        public TaskGraphics getTaskGraphics() {
            return taskGraphics;
        }

        public void setTaskGraphics(TaskGraphics taskGraphics) {
            this.taskGraphics = taskGraphics;
        }

        public TaskTranslations getTaskTranslations() {
            return taskTranslations;
        }

        public void setTaskTranslations(TaskTranslations taskTranslations) {
            this.taskTranslations = taskTranslations;
        }

        public TaskBugHunting getTaskBugHunting() {
            return taskBugHunting;
        }

        public void setTaskBugHunting(TaskBugHunting taskBugHunting) {
            this.taskBugHunting = taskBugHunting;
        }

        public TaskDevelopment getTaskDevelopment() {
            return taskDevelopment;
        }

        public void setTaskDevelopment(TaskDevelopment taskDevelopment) {
            this.taskDevelopment = taskDevelopment;
        }

        public TaskIdeas getTaskIdeas() {
            return taskIdeas;
        }

        public void setTaskIdeas(TaskIdeas taskIdeas) {
            this.taskIdeas = taskIdeas;
        }

        public Social getSocial() {
            return social;
        }

        public void setSocial(Social social) {
            this.social = social;
        }

        public Analysis getAnalysis() {
            return analysis;
        }

        public void setAnalysis(Analysis analysis) {
            this.analysis = analysis;
        }

        public Tutorials getTutorials() {
            return tutorials;
        }

        public void setTutorials(Tutorials tutorials) {
            this.tutorials = tutorials;
        }

        public VideoTutorials getVideoTutorials() {
            return videoTutorials;
        }

        public void setVideoTutorials(VideoTutorials videoTutorials) {
            this.videoTutorials = videoTutorials;
        }

        public Copywriting getCopywriting() {
            return copywriting;
        }

        public void setCopywriting(Copywriting copywriting) {
            this.copywriting = copywriting;
        }

        public Documentation getDocumentation() {
            return documentation;
        }

        public void setDocumentation(Documentation documentation) {
            this.documentation = documentation;
        }

        public Graphics getGraphics() {
            return graphics;
        }

        public void setGraphics(Graphics graphics) {
            this.graphics = graphics;
        }

        public Translations getTranslations() {
            return translations;
        }

        public void setTranslations(Translations translations) {
            this.translations = translations;
        }

        public BugHunting getBugHunting() {
            return bugHunting;
        }

        public void setBugHunting(BugHunting bugHunting) {
            this.bugHunting = bugHunting;
        }

        public Development getDevelopment() {
            return development;
        }

        public void setDevelopment(Development development) {
            this.development = development;
        }

        public SubProjects getSubProjects() {
            return subProjects;
        }

        public void setSubProjects(SubProjects subProjects) {
            this.subProjects = subProjects;
        }

        public Ideas getIdeas() {
            return ideas;
        }

        public void setIdeas(Ideas ideas) {
            this.ideas = ideas;
        }

    }

    public class Copywriting {

        @SerializedName("average_tags_per_post")
        @Expose
        private double averageTagsPerPost;

        @SerializedName("total_tags")
        @Expose
        private int totalTags;

        @SerializedName("average_links_per_post")
        @Expose
        private double averageLinksPerPost;

        @SerializedName("total_links")
        @Expose
        private int totalLinks;

        @SerializedName("average_images_per_post")
        @Expose
        private double averageImagesPerPost;

        @SerializedName("total_images")
        @Expose
        private int totalImages;

        @SerializedName("average_posts_length")
        @Expose
        private double averagePostsLength;

        @SerializedName("total_posts_length")
        @Expose
        private int totalPostsLength;

        @SerializedName("average_paid_curators")
        @Expose
        private double averagePaidCurators;

        @SerializedName("total_paid_curators")
        @Expose
        private double totalPaidCurators;

        @SerializedName("average_paid_authors")
        @Expose
        private double averagePaidAuthors;

        @SerializedName("total_paid_authors")
        @Expose
        private double totalPaidAuthors;

        @SerializedName("total_paid")
        @Expose
        private double totalPaid;

        @SerializedName("average_likes_per_post")
        @Expose
        private double averageLikesPerPost;

        @SerializedName("total_likes")
        @Expose
        private int totalLikes;

        @SerializedName("total_posts")
        @Expose
        private int totalPosts;

        public double getAverageTagsPerPost() {
            return averageTagsPerPost;
        }

        public void setAverageTagsPerPost(double averageTagsPerPost) {
            this.averageTagsPerPost = averageTagsPerPost;
        }

        public int getTotalTags() {
            return totalTags;
        }

        public void setTotalTags(int totalTags) {
            this.totalTags = totalTags;
        }

        public double getAverageLinksPerPost() {
            return averageLinksPerPost;
        }

        public void setAverageLinksPerPost(double averageLinksPerPost) {
            this.averageLinksPerPost = averageLinksPerPost;
        }

        public int getTotalLinks() {
            return totalLinks;
        }

        public void setTotalLinks(int totalLinks) {
            this.totalLinks = totalLinks;
        }

        public double getAverageImagesPerPost() {
            return averageImagesPerPost;
        }

        public void setAverageImagesPerPost(double averageImagesPerPost) {
            this.averageImagesPerPost = averageImagesPerPost;
        }

        public int getTotalImages() {
            return totalImages;
        }

        public void setTotalImages(int totalImages) {
            this.totalImages = totalImages;
        }

        public double getAveragePostsLength() {
            return averagePostsLength;
        }

        public void setAveragePostsLength(double averagePostsLength) {
            this.averagePostsLength = averagePostsLength;
        }

        public int getTotalPostsLength() {
            return totalPostsLength;
        }

        public void setTotalPostsLength(int totalPostsLength) {
            this.totalPostsLength = totalPostsLength;
        }

        public double getAveragePaidCurators() {
            return averagePaidCurators;
        }

        public void setAveragePaidCurators(double averagePaidCurators) {
            this.averagePaidCurators = averagePaidCurators;
        }

        public double getTotalPaidCurators() {
            return totalPaidCurators;
        }

        public void setTotalPaidCurators(double totalPaidCurators) {
            this.totalPaidCurators = totalPaidCurators;
        }

        public double getAveragePaidAuthors() {
            return averagePaidAuthors;
        }

        public void setAveragePaidAuthors(double averagePaidAuthors) {
            this.averagePaidAuthors = averagePaidAuthors;
        }

        public double getTotalPaidAuthors() {
            return totalPaidAuthors;
        }

        public void setTotalPaidAuthors(double totalPaidAuthors) {
            this.totalPaidAuthors = totalPaidAuthors;
        }

        public double getTotalPaid() {
            return totalPaid;
        }

        public void setTotalPaid(double totalPaid) {
            this.totalPaid = totalPaid;
        }

        public double getAverageLikesPerPost() {
            return averageLikesPerPost;
        }

        public void setAverageLikesPerPost(double averageLikesPerPost) {
            this.averageLikesPerPost = averageLikesPerPost;
        }

        public int getTotalLikes() {
            return totalLikes;
        }

        public void setTotalLikes(int totalLikes) {
            this.totalLikes = totalLikes;
        }

        public int getTotalPosts() {
            return totalPosts;
        }

        public void setTotalPosts(int totalPosts) {
            this.totalPosts = totalPosts;
        }

    }

    public class Development {

        @SerializedName("average_tags_per_post")
        @Expose
        private double averageTagsPerPost;

        @SerializedName("total_tags")
        @Expose
        private int totalTags;

        @SerializedName("average_links_per_post")
        @Expose
        private double averageLinksPerPost;

        @SerializedName("total_links")
        @Expose
        private int totalLinks;

        @SerializedName("average_images_per_post")
        @Expose
        private double averageImagesPerPost;

        @SerializedName("total_images")
        @Expose
        private int totalImages;

        @SerializedName("average_posts_length")
        @Expose
        private double averagePostsLength;

        @SerializedName("total_posts_length")
        @Expose
        private int totalPostsLength;

        @SerializedName("average_paid_curators")
        @Expose
        private double averagePaidCurators;

        @SerializedName("total_paid_curators")
        @Expose
        private double totalPaidCurators;

        @SerializedName("average_paid_authors")
        @Expose
        private double averagePaidAuthors;

        @SerializedName("total_paid_authors")
        @Expose
        private double totalPaidAuthors;

        @SerializedName("total_paid")
        @Expose
        private double totalPaid;

        @SerializedName("average_likes_per_post")
        @Expose
        private double averageLikesPerPost;

        @SerializedName("total_likes")
        @Expose
        private int totalLikes;

        @SerializedName("total_posts")
        @Expose
        private int totalPosts;

        public double getAverageTagsPerPost() {
            return averageTagsPerPost;
        }

        public void setAverageTagsPerPost(double averageTagsPerPost) {
            this.averageTagsPerPost = averageTagsPerPost;
        }

        public int getTotalTags() {
            return totalTags;
        }

        public void setTotalTags(int totalTags) {
            this.totalTags = totalTags;
        }

        public double getAverageLinksPerPost() {
            return averageLinksPerPost;
        }

        public void setAverageLinksPerPost(double averageLinksPerPost) {
            this.averageLinksPerPost = averageLinksPerPost;
        }

        public int getTotalLinks() {
            return totalLinks;
        }

        public void setTotalLinks(int totalLinks) {
            this.totalLinks = totalLinks;
        }

        public double getAverageImagesPerPost() {
            return averageImagesPerPost;
        }

        public void setAverageImagesPerPost(double averageImagesPerPost) {
            this.averageImagesPerPost = averageImagesPerPost;
        }

        public int getTotalImages() {
            return totalImages;
        }

        public void setTotalImages(int totalImages) {
            this.totalImages = totalImages;
        }

        public double getAveragePostsLength() {
            return averagePostsLength;
        }

        public void setAveragePostsLength(double averagePostsLength) {
            this.averagePostsLength = averagePostsLength;
        }

        public int getTotalPostsLength() {
            return totalPostsLength;
        }

        public void setTotalPostsLength(int totalPostsLength) {
            this.totalPostsLength = totalPostsLength;
        }

        public double getAveragePaidCurators() {
            return averagePaidCurators;
        }

        public void setAveragePaidCurators(double averagePaidCurators) {
            this.averagePaidCurators = averagePaidCurators;
        }

        public double getTotalPaidCurators() {
            return totalPaidCurators;
        }

        public void setTotalPaidCurators(double totalPaidCurators) {
            this.totalPaidCurators = totalPaidCurators;
        }

        public double getAveragePaidAuthors() {
            return averagePaidAuthors;
        }

        public void setAveragePaidAuthors(double averagePaidAuthors) {
            this.averagePaidAuthors = averagePaidAuthors;
        }

        public double getTotalPaidAuthors() {
            return totalPaidAuthors;
        }

        public void setTotalPaidAuthors(double totalPaidAuthors) {
            this.totalPaidAuthors = totalPaidAuthors;
        }

        public double getTotalPaid() {
            return totalPaid;
        }

        public void setTotalPaid(double totalPaid) {
            this.totalPaid = totalPaid;
        }

        public double getAverageLikesPerPost() {
            return averageLikesPerPost;
        }

        public void setAverageLikesPerPost(double averageLikesPerPost) {
            this.averageLikesPerPost = averageLikesPerPost;
        }

        public int getTotalLikes() {
            return totalLikes;
        }

        public void setTotalLikes(int totalLikes) {
            this.totalLikes = totalLikes;
        }

        public int getTotalPosts() {
            return totalPosts;
        }

        public void setTotalPosts(int totalPosts) {
            this.totalPosts = totalPosts;
        }

    }

    public class Documentation {

        @SerializedName("average_tags_per_post")
        @Expose
        private double averageTagsPerPost;

        @SerializedName("total_tags")
        @Expose
        private int totalTags;

        @SerializedName("average_links_per_post")
        @Expose
        private double averageLinksPerPost;

        @SerializedName("total_links")
        @Expose
        private int totalLinks;

        @SerializedName("average_images_per_post")
        @Expose
        private double averageImagesPerPost;

        @SerializedName("total_images")
        @Expose
        private int totalImages;

        @SerializedName("average_posts_length")
        @Expose
        private double averagePostsLength;

        @SerializedName("total_posts_length")
        @Expose
        private int totalPostsLength;

        @SerializedName("average_paid_curators")
        @Expose
        private double averagePaidCurators;

        @SerializedName("total_paid_curators")
        @Expose
        private double totalPaidCurators;

        @SerializedName("average_paid_authors")
        @Expose
        private double averagePaidAuthors;

        @SerializedName("total_paid_authors")
        @Expose
        private double totalPaidAuthors;

        @SerializedName("total_paid")
        @Expose
        private double totalPaid;

        @SerializedName("average_likes_per_post")
        @Expose
        private double averageLikesPerPost;

        @SerializedName("total_likes")
        @Expose
        private int totalLikes;

        @SerializedName("total_posts")
        @Expose
        private int totalPosts;

        public double getAverageTagsPerPost() {
            return averageTagsPerPost;
        }

        public void setAverageTagsPerPost(double averageTagsPerPost) {
            this.averageTagsPerPost = averageTagsPerPost;
        }

        public int getTotalTags() {
            return totalTags;
        }

        public void setTotalTags(int totalTags) {
            this.totalTags = totalTags;
        }

        public double getAverageLinksPerPost() {
            return averageLinksPerPost;
        }

        public void setAverageLinksPerPost(double averageLinksPerPost) {
            this.averageLinksPerPost = averageLinksPerPost;
        }

        public int getTotalLinks() {
            return totalLinks;
        }

        public void setTotalLinks(int totalLinks) {
            this.totalLinks = totalLinks;
        }

        public double getAverageImagesPerPost() {
            return averageImagesPerPost;
        }

        public void setAverageImagesPerPost(double averageImagesPerPost) {
            this.averageImagesPerPost = averageImagesPerPost;
        }

        public int getTotalImages() {
            return totalImages;
        }

        public void setTotalImages(int totalImages) {
            this.totalImages = totalImages;
        }

        public double getAveragePostsLength() {
            return averagePostsLength;
        }

        public void setAveragePostsLength(double averagePostsLength) {
            this.averagePostsLength = averagePostsLength;
        }

        public int getTotalPostsLength() {
            return totalPostsLength;
        }

        public void setTotalPostsLength(int totalPostsLength) {
            this.totalPostsLength = totalPostsLength;
        }

        public double getAveragePaidCurators() {
            return averagePaidCurators;
        }

        public void setAveragePaidCurators(double averagePaidCurators) {
            this.averagePaidCurators = averagePaidCurators;
        }

        public double getTotalPaidCurators() {
            return totalPaidCurators;
        }

        public void setTotalPaidCurators(double totalPaidCurators) {
            this.totalPaidCurators = totalPaidCurators;
        }

        public double getAveragePaidAuthors() {
            return averagePaidAuthors;
        }

        public void setAveragePaidAuthors(double averagePaidAuthors) {
            this.averagePaidAuthors = averagePaidAuthors;
        }

        public double getTotalPaidAuthors() {
            return totalPaidAuthors;
        }

        public void setTotalPaidAuthors(double totalPaidAuthors) {
            this.totalPaidAuthors = totalPaidAuthors;
        }

        public double getTotalPaid() {
            return totalPaid;
        }

        public void setTotalPaid(double totalPaid) {
            this.totalPaid = totalPaid;
        }

        public double getAverageLikesPerPost() {
            return averageLikesPerPost;
        }

        public void setAverageLikesPerPost(double averageLikesPerPost) {
            this.averageLikesPerPost = averageLikesPerPost;
        }

        public int getTotalLikes() {
            return totalLikes;
        }

        public void setTotalLikes(int totalLikes) {
            this.totalLikes = totalLikes;
        }

        public int getTotalPosts() {
            return totalPosts;
        }

        public void setTotalPosts(int totalPosts) {
            this.totalPosts = totalPosts;
        }

    }

    public class Graphics {

        @SerializedName("average_tags_per_post")
        @Expose
        private double averageTagsPerPost;

        @SerializedName("total_tags")
        @Expose
        private int totalTags;

        @SerializedName("average_links_per_post")
        @Expose
        private double averageLinksPerPost;

        @SerializedName("total_links")
        @Expose
        private int totalLinks;

        @SerializedName("average_images_per_post")
        @Expose
        private double averageImagesPerPost;

        @SerializedName("total_images")
        @Expose
        private int totalImages;

        @SerializedName("average_posts_length")
        @Expose
        private double averagePostsLength;

        @SerializedName("total_posts_length")
        @Expose
        private int totalPostsLength;

        @SerializedName("average_paid_curators")
        @Expose
        private double averagePaidCurators;

        @SerializedName("total_paid_curators")
        @Expose
        private double totalPaidCurators;

        @SerializedName("average_paid_authors")
        @Expose
        private double averagePaidAuthors;

        @SerializedName("total_paid_authors")
        @Expose
        private double totalPaidAuthors;

        @SerializedName("total_paid")
        @Expose
        private double totalPaid;

        @SerializedName("average_likes_per_post")
        @Expose
        private double averageLikesPerPost;

        @SerializedName("total_likes")
        @Expose
        private int totalLikes;

        @SerializedName("total_posts")
        @Expose
        private int totalPosts;

        public double getAverageTagsPerPost() {
            return averageTagsPerPost;
        }

        public void setAverageTagsPerPost(double averageTagsPerPost) {
            this.averageTagsPerPost = averageTagsPerPost;
        }

        public int getTotalTags() {
            return totalTags;
        }

        public void setTotalTags(int totalTags) {
            this.totalTags = totalTags;
        }

        public double getAverageLinksPerPost() {
            return averageLinksPerPost;
        }

        public void setAverageLinksPerPost(double averageLinksPerPost) {
            this.averageLinksPerPost = averageLinksPerPost;
        }

        public int getTotalLinks() {
            return totalLinks;
        }

        public void setTotalLinks(int totalLinks) {
            this.totalLinks = totalLinks;
        }

        public double getAverageImagesPerPost() {
            return averageImagesPerPost;
        }

        public void setAverageImagesPerPost(double averageImagesPerPost) {
            this.averageImagesPerPost = averageImagesPerPost;
        }

        public int getTotalImages() {
            return totalImages;
        }

        public void setTotalImages(int totalImages) {
            this.totalImages = totalImages;
        }

        public double getAveragePostsLength() {
            return averagePostsLength;
        }

        public void setAveragePostsLength(double averagePostsLength) {
            this.averagePostsLength = averagePostsLength;
        }

        public int getTotalPostsLength() {
            return totalPostsLength;
        }

        public void setTotalPostsLength(int totalPostsLength) {
            this.totalPostsLength = totalPostsLength;
        }

        public double getAveragePaidCurators() {
            return averagePaidCurators;
        }

        public void setAveragePaidCurators(double averagePaidCurators) {
            this.averagePaidCurators = averagePaidCurators;
        }

        public double getTotalPaidCurators() {
            return totalPaidCurators;
        }

        public void setTotalPaidCurators(double totalPaidCurators) {
            this.totalPaidCurators = totalPaidCurators;
        }

        public double getAveragePaidAuthors() {
            return averagePaidAuthors;
        }

        public void setAveragePaidAuthors(double averagePaidAuthors) {
            this.averagePaidAuthors = averagePaidAuthors;
        }

        public double getTotalPaidAuthors() {
            return totalPaidAuthors;
        }

        public void setTotalPaidAuthors(double totalPaidAuthors) {
            this.totalPaidAuthors = totalPaidAuthors;
        }

        public double getTotalPaid() {
            return totalPaid;
        }

        public void setTotalPaid(double totalPaid) {
            this.totalPaid = totalPaid;
        }

        public double getAverageLikesPerPost() {
            return averageLikesPerPost;
        }

        public void setAverageLikesPerPost(double averageLikesPerPost) {
            this.averageLikesPerPost = averageLikesPerPost;
        }

        public int getTotalLikes() {
            return totalLikes;
        }

        public void setTotalLikes(int totalLikes) {
            this.totalLikes = totalLikes;
        }

        public int getTotalPosts() {
            return totalPosts;
        }

        public void setTotalPosts(int totalPosts) {
            this.totalPosts = totalPosts;
        }

    }

    public class Ideas {

        @SerializedName("average_tags_per_post")
        @Expose
        private double averageTagsPerPost;

        @SerializedName("total_tags")
        @Expose
        private int totalTags;

        @SerializedName("average_links_per_post")
        @Expose
        private double averageLinksPerPost;

        @SerializedName("total_links")
        @Expose
        private int totalLinks;

        @SerializedName("average_images_per_post")
        @Expose
        private double averageImagesPerPost;

        @SerializedName("total_images")
        @Expose
        private int totalImages;

        @SerializedName("average_posts_length")
        @Expose
        private double averagePostsLength;

        @SerializedName("total_posts_length")
        @Expose
        private int totalPostsLength;

        @SerializedName("average_paid_curators")
        @Expose
        private double averagePaidCurators;

        @SerializedName("total_paid_curators")
        @Expose
        private double totalPaidCurators;

        @SerializedName("average_paid_authors")
        @Expose
        private double averagePaidAuthors;

        @SerializedName("total_paid_authors")
        @Expose
        private double totalPaidAuthors;

        @SerializedName("total_paid")
        @Expose
        private double totalPaid;

        @SerializedName("average_likes_per_post")
        @Expose
        private double averageLikesPerPost;

        @SerializedName("total_likes")
        @Expose
        private int totalLikes;

        @SerializedName("total_posts")
        @Expose
        private int totalPosts;

        public double getAverageTagsPerPost() {
            return averageTagsPerPost;
        }

        public void setAverageTagsPerPost(double averageTagsPerPost) {
            this.averageTagsPerPost = averageTagsPerPost;
        }

        public int getTotalTags() {
            return totalTags;
        }

        public void setTotalTags(int totalTags) {
            this.totalTags = totalTags;
        }

        public double getAverageLinksPerPost() {
            return averageLinksPerPost;
        }

        public void setAverageLinksPerPost(double averageLinksPerPost) {
            this.averageLinksPerPost = averageLinksPerPost;
        }

        public int getTotalLinks() {
            return totalLinks;
        }

        public void setTotalLinks(int totalLinks) {
            this.totalLinks = totalLinks;
        }

        public double getAverageImagesPerPost() {
            return averageImagesPerPost;
        }

        public void setAverageImagesPerPost(double averageImagesPerPost) {
            this.averageImagesPerPost = averageImagesPerPost;
        }

        public int getTotalImages() {
            return totalImages;
        }

        public void setTotalImages(int totalImages) {
            this.totalImages = totalImages;
        }

        public double getAveragePostsLength() {
            return averagePostsLength;
        }

        public void setAveragePostsLength(double averagePostsLength) {
            this.averagePostsLength = averagePostsLength;
        }

        public int getTotalPostsLength() {
            return totalPostsLength;
        }

        public void setTotalPostsLength(int totalPostsLength) {
            this.totalPostsLength = totalPostsLength;
        }

        public double getAveragePaidCurators() {
            return averagePaidCurators;
        }

        public void setAveragePaidCurators(double averagePaidCurators) {
            this.averagePaidCurators = averagePaidCurators;
        }

        public double getTotalPaidCurators() {
            return totalPaidCurators;
        }

        public void setTotalPaidCurators(double totalPaidCurators) {
            this.totalPaidCurators = totalPaidCurators;
        }

        public double getAveragePaidAuthors() {
            return averagePaidAuthors;
        }

        public void setAveragePaidAuthors(double averagePaidAuthors) {
            this.averagePaidAuthors = averagePaidAuthors;
        }

        public double getTotalPaidAuthors() {
            return totalPaidAuthors;
        }

        public void setTotalPaidAuthors(double totalPaidAuthors) {
            this.totalPaidAuthors = totalPaidAuthors;
        }

        public double getTotalPaid() {
            return totalPaid;
        }

        public void setTotalPaid(double totalPaid) {
            this.totalPaid = totalPaid;
        }

        public double getAverageLikesPerPost() {
            return averageLikesPerPost;
        }

        public void setAverageLikesPerPost(double averageLikesPerPost) {
            this.averageLikesPerPost = averageLikesPerPost;
        }

        public int getTotalLikes() {
            return totalLikes;
        }

        public void setTotalLikes(int totalLikes) {
            this.totalLikes = totalLikes;
        }

        public int getTotalPosts() {
            return totalPosts;
        }

        public void setTotalPosts(int totalPosts) {
            this.totalPosts = totalPosts;
        }

    }

    public class Social {

        @SerializedName("average_tags_per_post")
        @Expose
        private double averageTagsPerPost;

        @SerializedName("total_tags")
        @Expose
        private int totalTags;

        @SerializedName("average_links_per_post")
        @Expose
        private double averageLinksPerPost;

        @SerializedName("total_links")
        @Expose
        private int totalLinks;

        @SerializedName("average_images_per_post")
        @Expose
        private double averageImagesPerPost;

        @SerializedName("total_images")
        @Expose
        private int totalImages;

        @SerializedName("average_posts_length")
        @Expose
        private double averagePostsLength;

        @SerializedName("total_posts_length")
        @Expose
        private int totalPostsLength;

        @SerializedName("average_paid_curators")
        @Expose
        private double averagePaidCurators;

        @SerializedName("total_paid_curators")
        @Expose
        private double totalPaidCurators;

        @SerializedName("average_paid_authors")
        @Expose
        private double averagePaidAuthors;

        @SerializedName("total_paid_authors")
        @Expose
        private double totalPaidAuthors;

        @SerializedName("total_paid")
        @Expose
        private double totalPaid;

        @SerializedName("average_likes_per_post")
        @Expose
        private double averageLikesPerPost;

        @SerializedName("total_likes")
        @Expose
        private int totalLikes;

        @SerializedName("total_posts")
        @Expose
        private int totalPosts;

        public double getAverageTagsPerPost() {
            return averageTagsPerPost;
        }

        public void setAverageTagsPerPost(double averageTagsPerPost) {
            this.averageTagsPerPost = averageTagsPerPost;
        }

        public int getTotalTags() {
            return totalTags;
        }

        public void setTotalTags(int totalTags) {
            this.totalTags = totalTags;
        }

        public double getAverageLinksPerPost() {
            return averageLinksPerPost;
        }

        public void setAverageLinksPerPost(double averageLinksPerPost) {
            this.averageLinksPerPost = averageLinksPerPost;
        }

        public int getTotalLinks() {
            return totalLinks;
        }

        public void setTotalLinks(int totalLinks) {
            this.totalLinks = totalLinks;
        }

        public double getAverageImagesPerPost() {
            return averageImagesPerPost;
        }

        public void setAverageImagesPerPost(double averageImagesPerPost) {
            this.averageImagesPerPost = averageImagesPerPost;
        }

        public int getTotalImages() {
            return totalImages;
        }

        public void setTotalImages(int totalImages) {
            this.totalImages = totalImages;
        }

        public double getAveragePostsLength() {
            return averagePostsLength;
        }

        public void setAveragePostsLength(double averagePostsLength) {
            this.averagePostsLength = averagePostsLength;
        }

        public int getTotalPostsLength() {
            return totalPostsLength;
        }

        public void setTotalPostsLength(int totalPostsLength) {
            this.totalPostsLength = totalPostsLength;
        }

        public double getAveragePaidCurators() {
            return averagePaidCurators;
        }

        public void setAveragePaidCurators(double averagePaidCurators) {
            this.averagePaidCurators = averagePaidCurators;
        }

        public double getTotalPaidCurators() {
            return totalPaidCurators;
        }

        public void setTotalPaidCurators(double totalPaidCurators) {
            this.totalPaidCurators = totalPaidCurators;
        }

        public double getAveragePaidAuthors() {
            return averagePaidAuthors;
        }

        public void setAveragePaidAuthors(double averagePaidAuthors) {
            this.averagePaidAuthors = averagePaidAuthors;
        }

        public double getTotalPaidAuthors() {
            return totalPaidAuthors;
        }

        public void setTotalPaidAuthors(double totalPaidAuthors) {
            this.totalPaidAuthors = totalPaidAuthors;
        }

        public double getTotalPaid() {
            return totalPaid;
        }

        public void setTotalPaid(double totalPaid) {
            this.totalPaid = totalPaid;
        }

        public double getAverageLikesPerPost() {
            return averageLikesPerPost;
        }

        public void setAverageLikesPerPost(double averageLikesPerPost) {
            this.averageLikesPerPost = averageLikesPerPost;
        }

        public int getTotalLikes() {
            return totalLikes;
        }

        public void setTotalLikes(int totalLikes) {
            this.totalLikes = totalLikes;
        }

        public int getTotalPosts() {
            return totalPosts;
        }

        public void setTotalPosts(int totalPosts) {
            this.totalPosts = totalPosts;
        }

    }

    public class SubProjects {

        @SerializedName("average_tags_per_post")
        @Expose
        private int averageTagsPerPost;

        @SerializedName("total_tags")
        @Expose
        private int totalTags;

        @SerializedName("average_links_per_post")
        @Expose
        private double averageLinksPerPost;

        @SerializedName("total_links")
        @Expose
        private int totalLinks;

        @SerializedName("average_images_per_post")
        @Expose
        private double averageImagesPerPost;

        @SerializedName("total_images")
        @Expose
        private int totalImages;

        @SerializedName("average_posts_length")
        @Expose
        private double averagePostsLength;

        @SerializedName("total_posts_length")
        @Expose
        private int totalPostsLength;

        @SerializedName("average_paid_curators")
        @Expose
        private double averagePaidCurators;

        @SerializedName("total_paid_curators")
        @Expose
        private double totalPaidCurators;

        @SerializedName("average_paid_authors")
        @Expose
        private double averagePaidAuthors;

        @SerializedName("total_paid_authors")
        @Expose
        private double totalPaidAuthors;

        @SerializedName("total_paid")
        @Expose
        private double totalPaid;

        @SerializedName("average_likes_per_post")
        @Expose
        private double averageLikesPerPost;

        @SerializedName("total_likes")
        @Expose
        private int totalLikes;

        @SerializedName("total_posts")
        @Expose
        private int totalPosts;

        public int getAverageTagsPerPost() {
            return averageTagsPerPost;
        }

        public void setAverageTagsPerPost(int averageTagsPerPost) {
            this.averageTagsPerPost = averageTagsPerPost;
        }

        public int getTotalTags() {
            return totalTags;
        }

        public void setTotalTags(int totalTags) {
            this.totalTags = totalTags;
        }

        public double getAverageLinksPerPost() {
            return averageLinksPerPost;
        }

        public void setAverageLinksPerPost(double averageLinksPerPost) {
            this.averageLinksPerPost = averageLinksPerPost;
        }

        public int getTotalLinks() {
            return totalLinks;
        }

        public void setTotalLinks(int totalLinks) {
            this.totalLinks = totalLinks;
        }

        public double getAverageImagesPerPost() {
            return averageImagesPerPost;
        }

        public void setAverageImagesPerPost(double averageImagesPerPost) {
            this.averageImagesPerPost = averageImagesPerPost;
        }

        public int getTotalImages() {
            return totalImages;
        }

        public void setTotalImages(int totalImages) {
            this.totalImages = totalImages;
        }

        public double getAveragePostsLength() {
            return averagePostsLength;
        }

        public void setAveragePostsLength(double averagePostsLength) {
            this.averagePostsLength = averagePostsLength;
        }

        public int getTotalPostsLength() {
            return totalPostsLength;
        }

        public void setTotalPostsLength(int totalPostsLength) {
            this.totalPostsLength = totalPostsLength;
        }

        public double getAveragePaidCurators() {
            return averagePaidCurators;
        }

        public void setAveragePaidCurators(double averagePaidCurators) {
            this.averagePaidCurators = averagePaidCurators;
        }

        public double getTotalPaidCurators() {
            return totalPaidCurators;
        }

        public void setTotalPaidCurators(double totalPaidCurators) {
            this.totalPaidCurators = totalPaidCurators;
        }

        public double getAveragePaidAuthors() {
            return averagePaidAuthors;
        }

        public void setAveragePaidAuthors(double averagePaidAuthors) {
            this.averagePaidAuthors = averagePaidAuthors;
        }

        public double getTotalPaidAuthors() {
            return totalPaidAuthors;
        }

        public void setTotalPaidAuthors(double totalPaidAuthors) {
            this.totalPaidAuthors = totalPaidAuthors;
        }

        public double getTotalPaid() {
            return totalPaid;
        }

        public void setTotalPaid(double totalPaid) {
            this.totalPaid = totalPaid;
        }

        public double getAverageLikesPerPost() {
            return averageLikesPerPost;
        }

        public void setAverageLikesPerPost(double averageLikesPerPost) {
            this.averageLikesPerPost = averageLikesPerPost;
        }

        public int getTotalLikes() {
            return totalLikes;
        }

        public void setTotalLikes(int totalLikes) {
            this.totalLikes = totalLikes;
        }

        public int getTotalPosts() {
            return totalPosts;
        }

        public void setTotalPosts(int totalPosts) {
            this.totalPosts = totalPosts;
        }

    }

    public class TaskBugHunting {

        @SerializedName("average_tags_per_post")
        @Expose
        private int averageTagsPerPost;

        @SerializedName("total_tags")
        @Expose
        private int totalTags;

        @SerializedName("average_links_per_post")
        @Expose
        private int averageLinksPerPost;

        @SerializedName("total_links")
        @Expose
        private int totalLinks;

        @SerializedName("average_images_per_post")
        @Expose
        private int averageImagesPerPost;

        @SerializedName("total_images")
        @Expose
        private int totalImages;

        @SerializedName("average_posts_length")
        @Expose
        private int averagePostsLength;

        @SerializedName("total_posts_length")
        @Expose
        private int totalPostsLength;

        @SerializedName("average_paid_curators")
        @Expose
        private double averagePaidCurators;

        @SerializedName("total_paid_curators")
        @Expose
        private double totalPaidCurators;

        @SerializedName("average_paid_authors")
        @Expose
        private double averagePaidAuthors;

        @SerializedName("total_paid_authors")
        @Expose
        private double totalPaidAuthors;

        @SerializedName("total_paid")
        @Expose
        private double totalPaid;

        @SerializedName("average_likes_per_post")
        @Expose
        private int averageLikesPerPost;

        @SerializedName("total_likes")
        @Expose
        private int totalLikes;

        @SerializedName("total_posts")
        @Expose
        private int totalPosts;

        public int getAverageTagsPerPost() {
            return averageTagsPerPost;
        }

        public void setAverageTagsPerPost(int averageTagsPerPost) {
            this.averageTagsPerPost = averageTagsPerPost;
        }

        public int getTotalTags() {
            return totalTags;
        }

        public void setTotalTags(int totalTags) {
            this.totalTags = totalTags;
        }

        public int getAverageLinksPerPost() {
            return averageLinksPerPost;
        }

        public void setAverageLinksPerPost(int averageLinksPerPost) {
            this.averageLinksPerPost = averageLinksPerPost;
        }

        public int getTotalLinks() {
            return totalLinks;
        }

        public void setTotalLinks(int totalLinks) {
            this.totalLinks = totalLinks;
        }

        public int getAverageImagesPerPost() {
            return averageImagesPerPost;
        }

        public void setAverageImagesPerPost(int averageImagesPerPost) {
            this.averageImagesPerPost = averageImagesPerPost;
        }

        public int getTotalImages() {
            return totalImages;
        }

        public void setTotalImages(int totalImages) {
            this.totalImages = totalImages;
        }

        public int getAveragePostsLength() {
            return averagePostsLength;
        }

        public void setAveragePostsLength(int averagePostsLength) {
            this.averagePostsLength = averagePostsLength;
        }

        public int getTotalPostsLength() {
            return totalPostsLength;
        }

        public void setTotalPostsLength(int totalPostsLength) {
            this.totalPostsLength = totalPostsLength;
        }

        public double getAveragePaidCurators() {
            return averagePaidCurators;
        }

        public void setAveragePaidCurators(double averagePaidCurators) {
            this.averagePaidCurators = averagePaidCurators;
        }

        public double getTotalPaidCurators() {
            return totalPaidCurators;
        }

        public void setTotalPaidCurators(double totalPaidCurators) {
            this.totalPaidCurators = totalPaidCurators;
        }

        public double getAveragePaidAuthors() {
            return averagePaidAuthors;
        }

        public void setAveragePaidAuthors(double averagePaidAuthors) {
            this.averagePaidAuthors = averagePaidAuthors;
        }

        public double getTotalPaidAuthors() {
            return totalPaidAuthors;
        }

        public void setTotalPaidAuthors(double totalPaidAuthors) {
            this.totalPaidAuthors = totalPaidAuthors;
        }

        public double getTotalPaid() {
            return totalPaid;
        }

        public void setTotalPaid(double totalPaid) {
            this.totalPaid = totalPaid;
        }

        public int getAverageLikesPerPost() {
            return averageLikesPerPost;
        }

        public void setAverageLikesPerPost(int averageLikesPerPost) {
            this.averageLikesPerPost = averageLikesPerPost;
        }

        public int getTotalLikes() {
            return totalLikes;
        }

        public void setTotalLikes(int totalLikes) {
            this.totalLikes = totalLikes;
        }

        public int getTotalPosts() {
            return totalPosts;
        }

        public void setTotalPosts(int totalPosts) {
            this.totalPosts = totalPosts;
        }

    }

    public class TaskDevelopment {

        @SerializedName("average_tags_per_post")
        @Expose
        private double averageTagsPerPost;

        @SerializedName("total_tags")
        @Expose
        private int totalTags;

        @SerializedName("average_links_per_post")
        @Expose
        private double averageLinksPerPost;

        @SerializedName("total_links")
        @Expose
        private int totalLinks;

        @SerializedName("average_images_per_post")
        @Expose
        private double averageImagesPerPost;

        @SerializedName("total_images")
        @Expose
        private int totalImages;

        @SerializedName("average_posts_length")
        @Expose
        private double averagePostsLength;

        @SerializedName("total_posts_length")
        @Expose
        private int totalPostsLength;

        @SerializedName("average_paid_curators")
        @Expose
        private double averagePaidCurators;

        @SerializedName("total_paid_curators")
        @Expose
        private double totalPaidCurators;

        @SerializedName("average_paid_authors")
        @Expose
        private double averagePaidAuthors;

        @SerializedName("total_paid_authors")
        @Expose
        private double totalPaidAuthors;

        @SerializedName("total_paid")
        @Expose
        private double totalPaid;

        @SerializedName("average_likes_per_post")
        @Expose
        private double averageLikesPerPost;

        @SerializedName("total_likes")
        @Expose
        private int totalLikes;

        @SerializedName("total_posts")
        @Expose
        private int totalPosts;

        public double getAverageTagsPerPost() {
            return averageTagsPerPost;
        }

        public void setAverageTagsPerPost(double averageTagsPerPost) {
            this.averageTagsPerPost = averageTagsPerPost;
        }

        public int getTotalTags() {
            return totalTags;
        }

        public void setTotalTags(int totalTags) {
            this.totalTags = totalTags;
        }

        public double getAverageLinksPerPost() {
            return averageLinksPerPost;
        }

        public void setAverageLinksPerPost(double averageLinksPerPost) {
            this.averageLinksPerPost = averageLinksPerPost;
        }

        public int getTotalLinks() {
            return totalLinks;
        }

        public void setTotalLinks(int totalLinks) {
            this.totalLinks = totalLinks;
        }

        public double getAverageImagesPerPost() {
            return averageImagesPerPost;
        }

        public void setAverageImagesPerPost(double averageImagesPerPost) {
            this.averageImagesPerPost = averageImagesPerPost;
        }

        public int getTotalImages() {
            return totalImages;
        }

        public void setTotalImages(int totalImages) {
            this.totalImages = totalImages;
        }

        public double getAveragePostsLength() {
            return averagePostsLength;
        }

        public void setAveragePostsLength(double averagePostsLength) {
            this.averagePostsLength = averagePostsLength;
        }

        public int getTotalPostsLength() {
            return totalPostsLength;
        }

        public void setTotalPostsLength(int totalPostsLength) {
            this.totalPostsLength = totalPostsLength;
        }

        public double getAveragePaidCurators() {
            return averagePaidCurators;
        }

        public void setAveragePaidCurators(double averagePaidCurators) {
            this.averagePaidCurators = averagePaidCurators;
        }

        public double getTotalPaidCurators() {
            return totalPaidCurators;
        }

        public void setTotalPaidCurators(double totalPaidCurators) {
            this.totalPaidCurators = totalPaidCurators;
        }

        public double getAveragePaidAuthors() {
            return averagePaidAuthors;
        }

        public void setAveragePaidAuthors(double averagePaidAuthors) {
            this.averagePaidAuthors = averagePaidAuthors;
        }

        public double getTotalPaidAuthors() {
            return totalPaidAuthors;
        }

        public void setTotalPaidAuthors(double totalPaidAuthors) {
            this.totalPaidAuthors = totalPaidAuthors;
        }

        public double getTotalPaid() {
            return totalPaid;
        }

        public void setTotalPaid(double totalPaid) {
            this.totalPaid = totalPaid;
        }

        public double getAverageLikesPerPost() {
            return averageLikesPerPost;
        }

        public void setAverageLikesPerPost(double averageLikesPerPost) {
            this.averageLikesPerPost = averageLikesPerPost;
        }

        public int getTotalLikes() {
            return totalLikes;
        }

        public void setTotalLikes(int totalLikes) {
            this.totalLikes = totalLikes;
        }

        public int getTotalPosts() {
            return totalPosts;
        }

        public void setTotalPosts(int totalPosts) {
            this.totalPosts = totalPosts;
        }

    }

    public class TaskDocumentation {

        @SerializedName("average_tags_per_post")
        @Expose
        private int averageTagsPerPost;

        @SerializedName("total_tags")
        @Expose
        private int totalTags;

        @SerializedName("average_links_per_post")
        @Expose
        private double averageLinksPerPost;

        @SerializedName("total_links")
        @Expose
        private int totalLinks;

        @SerializedName("average_images_per_post")
        @Expose
        private int averageImagesPerPost;

        @SerializedName("total_images")
        @Expose
        private int totalImages;

        @SerializedName("average_posts_length")
        @Expose
        private double averagePostsLength;

        @SerializedName("total_posts_length")
        @Expose
        private int totalPostsLength;

        @SerializedName("average_paid_curators")
        @Expose
        private double averagePaidCurators;

        @SerializedName("total_paid_curators")
        @Expose
        private double totalPaidCurators;

        @SerializedName("average_paid_authors")
        @Expose
        private double averagePaidAuthors;

        @SerializedName("total_paid_authors")
        @Expose
        private double totalPaidAuthors;

        @SerializedName("total_paid")
        @Expose
        private double totalPaid;

        @SerializedName("average_likes_per_post")
        @Expose
        private double averageLikesPerPost;

        @SerializedName("total_likes")
        @Expose
        private int totalLikes;

        @SerializedName("total_posts")
        @Expose
        private int totalPosts;

        public int getAverageTagsPerPost() {
            return averageTagsPerPost;
        }

        public void setAverageTagsPerPost(int averageTagsPerPost) {
            this.averageTagsPerPost = averageTagsPerPost;
        }

        public int getTotalTags() {
            return totalTags;
        }

        public void setTotalTags(int totalTags) {
            this.totalTags = totalTags;
        }

        public double getAverageLinksPerPost() {
            return averageLinksPerPost;
        }

        public void setAverageLinksPerPost(double averageLinksPerPost) {
            this.averageLinksPerPost = averageLinksPerPost;
        }

        public int getTotalLinks() {
            return totalLinks;
        }

        public void setTotalLinks(int totalLinks) {
            this.totalLinks = totalLinks;
        }

        public int getAverageImagesPerPost() {
            return averageImagesPerPost;
        }

        public void setAverageImagesPerPost(int averageImagesPerPost) {
            this.averageImagesPerPost = averageImagesPerPost;
        }

        public int getTotalImages() {
            return totalImages;
        }

        public void setTotalImages(int totalImages) {
            this.totalImages = totalImages;
        }

        public double getAveragePostsLength() {
            return averagePostsLength;
        }

        public void setAveragePostsLength(double averagePostsLength) {
            this.averagePostsLength = averagePostsLength;
        }

        public int getTotalPostsLength() {
            return totalPostsLength;
        }

        public void setTotalPostsLength(int totalPostsLength) {
            this.totalPostsLength = totalPostsLength;
        }

        public double getAveragePaidCurators() {
            return averagePaidCurators;
        }

        public void setAveragePaidCurators(double averagePaidCurators) {
            this.averagePaidCurators = averagePaidCurators;
        }

        public double getTotalPaidCurators() {
            return totalPaidCurators;
        }

        public void setTotalPaidCurators(double totalPaidCurators) {
            this.totalPaidCurators = totalPaidCurators;
        }

        public double getAveragePaidAuthors() {
            return averagePaidAuthors;
        }

        public void setAveragePaidAuthors(double averagePaidAuthors) {
            this.averagePaidAuthors = averagePaidAuthors;
        }

        public double getTotalPaidAuthors() {
            return totalPaidAuthors;
        }

        public void setTotalPaidAuthors(double totalPaidAuthors) {
            this.totalPaidAuthors = totalPaidAuthors;
        }

        public double getTotalPaid() {
            return totalPaid;
        }

        public void setTotalPaid(double totalPaid) {
            this.totalPaid = totalPaid;
        }

        public double getAverageLikesPerPost() {
            return averageLikesPerPost;
        }

        public void setAverageLikesPerPost(double averageLikesPerPost) {
            this.averageLikesPerPost = averageLikesPerPost;
        }

        public int getTotalLikes() {
            return totalLikes;
        }

        public void setTotalLikes(int totalLikes) {
            this.totalLikes = totalLikes;
        }

        public int getTotalPosts() {
            return totalPosts;
        }

        public void setTotalPosts(int totalPosts) {
            this.totalPosts = totalPosts;
        }

    }

    public class TaskGraphics {

        @SerializedName("average_tags_per_post")
        @Expose
        private double averageTagsPerPost;

        @SerializedName("total_tags")
        @Expose
        private int totalTags;

        @SerializedName("average_links_per_post")
        @Expose
        private double averageLinksPerPost;

        @SerializedName("total_links")
        @Expose
        private int totalLinks;

        @SerializedName("average_images_per_post")
        @Expose
        private double averageImagesPerPost;

        @SerializedName("total_images")
        @Expose
        private int totalImages;

        @SerializedName("average_posts_length")
        @Expose
        private double averagePostsLength;

        @SerializedName("total_posts_length")
        @Expose
        private int totalPostsLength;

        @SerializedName("average_paid_curators")
        @Expose
        private double averagePaidCurators;

        @SerializedName("total_paid_curators")
        @Expose
        private double totalPaidCurators;

        @SerializedName("average_paid_authors")
        @Expose
        private double averagePaidAuthors;

        @SerializedName("total_paid_authors")
        @Expose
        private double totalPaidAuthors;

        @SerializedName("total_paid")
        @Expose
        private double totalPaid;

        @SerializedName("average_likes_per_post")
        @Expose
        private double averageLikesPerPost;

        @SerializedName("total_likes")
        @Expose
        private int totalLikes;

        @SerializedName("total_posts")
        @Expose
        private int totalPosts;

        public double getAverageTagsPerPost() {
            return averageTagsPerPost;
        }

        public void setAverageTagsPerPost(double averageTagsPerPost) {
            this.averageTagsPerPost = averageTagsPerPost;
        }

        public int getTotalTags() {
            return totalTags;
        }

        public void setTotalTags(int totalTags) {
            this.totalTags = totalTags;
        }

        public double getAverageLinksPerPost() {
            return averageLinksPerPost;
        }

        public void setAverageLinksPerPost(double averageLinksPerPost) {
            this.averageLinksPerPost = averageLinksPerPost;
        }

        public int getTotalLinks() {
            return totalLinks;
        }

        public void setTotalLinks(int totalLinks) {
            this.totalLinks = totalLinks;
        }

        public double getAverageImagesPerPost() {
            return averageImagesPerPost;
        }

        public void setAverageImagesPerPost(double averageImagesPerPost) {
            this.averageImagesPerPost = averageImagesPerPost;
        }

        public int getTotalImages() {
            return totalImages;
        }

        public void setTotalImages(int totalImages) {
            this.totalImages = totalImages;
        }

        public double getAveragePostsLength() {
            return averagePostsLength;
        }

        public void setAveragePostsLength(double averagePostsLength) {
            this.averagePostsLength = averagePostsLength;
        }

        public int getTotalPostsLength() {
            return totalPostsLength;
        }

        public void setTotalPostsLength(int totalPostsLength) {
            this.totalPostsLength = totalPostsLength;
        }

        public double getAveragePaidCurators() {
            return averagePaidCurators;
        }

        public void setAveragePaidCurators(double averagePaidCurators) {
            this.averagePaidCurators = averagePaidCurators;
        }

        public double getTotalPaidCurators() {
            return totalPaidCurators;
        }

        public void setTotalPaidCurators(double totalPaidCurators) {
            this.totalPaidCurators = totalPaidCurators;
        }

        public double getAveragePaidAuthors() {
            return averagePaidAuthors;
        }

        public void setAveragePaidAuthors(double averagePaidAuthors) {
            this.averagePaidAuthors = averagePaidAuthors;
        }

        public double getTotalPaidAuthors() {
            return totalPaidAuthors;
        }

        public void setTotalPaidAuthors(double totalPaidAuthors) {
            this.totalPaidAuthors = totalPaidAuthors;
        }

        public double getTotalPaid() {
            return totalPaid;
        }

        public void setTotalPaid(double totalPaid) {
            this.totalPaid = totalPaid;
        }

        public double getAverageLikesPerPost() {
            return averageLikesPerPost;
        }

        public void setAverageLikesPerPost(double averageLikesPerPost) {
            this.averageLikesPerPost = averageLikesPerPost;
        }

        public int getTotalLikes() {
            return totalLikes;
        }

        public void setTotalLikes(int totalLikes) {
            this.totalLikes = totalLikes;
        }

        public int getTotalPosts() {
            return totalPosts;
        }

        public void setTotalPosts(int totalPosts) {
            this.totalPosts = totalPosts;
        }

    }

    public class TaskIdeas {

        @SerializedName("average_tags_per_post")
        @Expose
        private double averageTagsPerPost;

        @SerializedName("total_tags")
        @Expose
        private int totalTags;

        @SerializedName("average_links_per_post")
        @Expose
        private double averageLinksPerPost;

        @SerializedName("total_links")
        @Expose
        private int totalLinks;

        @SerializedName("average_images_per_post")
        @Expose
        private double averageImagesPerPost;

        @SerializedName("total_images")
        @Expose
        private int totalImages;

        @SerializedName("average_posts_length")
        @Expose
        private double averagePostsLength;

        @SerializedName("total_posts_length")
        @Expose
        private int totalPostsLength;

        @SerializedName("average_paid_curators")
        @Expose
        private double averagePaidCurators;

        @SerializedName("total_paid_curators")
        @Expose
        private double totalPaidCurators;

        @SerializedName("average_paid_authors")
        @Expose
        private double averagePaidAuthors;

        @SerializedName("total_paid_authors")
        @Expose
        private double totalPaidAuthors;

        @SerializedName("total_paid")
        @Expose
        private double totalPaid;

        @SerializedName("average_likes_per_post")
        @Expose
        private double averageLikesPerPost;

        @SerializedName("total_likes")
        @Expose
        private int totalLikes;

        @SerializedName("total_posts")
        @Expose
        private int totalPosts;

        public double getAverageTagsPerPost() {
            return averageTagsPerPost;
        }

        public void setAverageTagsPerPost(double averageTagsPerPost) {
            this.averageTagsPerPost = averageTagsPerPost;
        }

        public int getTotalTags() {
            return totalTags;
        }

        public void setTotalTags(int totalTags) {
            this.totalTags = totalTags;
        }

        public double getAverageLinksPerPost() {
            return averageLinksPerPost;
        }

        public void setAverageLinksPerPost(double averageLinksPerPost) {
            this.averageLinksPerPost = averageLinksPerPost;
        }

        public int getTotalLinks() {
            return totalLinks;
        }

        public void setTotalLinks(int totalLinks) {
            this.totalLinks = totalLinks;
        }

        public double getAverageImagesPerPost() {
            return averageImagesPerPost;
        }

        public void setAverageImagesPerPost(double averageImagesPerPost) {
            this.averageImagesPerPost = averageImagesPerPost;
        }

        public int getTotalImages() {
            return totalImages;
        }

        public void setTotalImages(int totalImages) {
            this.totalImages = totalImages;
        }

        public double getAveragePostsLength() {
            return averagePostsLength;
        }

        public void setAveragePostsLength(double averagePostsLength) {
            this.averagePostsLength = averagePostsLength;
        }

        public int getTotalPostsLength() {
            return totalPostsLength;
        }

        public void setTotalPostsLength(int totalPostsLength) {
            this.totalPostsLength = totalPostsLength;
        }

        public double getAveragePaidCurators() {
            return averagePaidCurators;
        }

        public void setAveragePaidCurators(double averagePaidCurators) {
            this.averagePaidCurators = averagePaidCurators;
        }

        public double getTotalPaidCurators() {
            return totalPaidCurators;
        }

        public void setTotalPaidCurators(double totalPaidCurators) {
            this.totalPaidCurators = totalPaidCurators;
        }

        public double getAveragePaidAuthors() {
            return averagePaidAuthors;
        }

        public void setAveragePaidAuthors(double averagePaidAuthors) {
            this.averagePaidAuthors = averagePaidAuthors;
        }

        public double getTotalPaidAuthors() {
            return totalPaidAuthors;
        }

        public void setTotalPaidAuthors(double totalPaidAuthors) {
            this.totalPaidAuthors = totalPaidAuthors;
        }

        public double getTotalPaid() {
            return totalPaid;
        }

        public void setTotalPaid(double totalPaid) {
            this.totalPaid = totalPaid;
        }

        public double getAverageLikesPerPost() {
            return averageLikesPerPost;
        }

        public void setAverageLikesPerPost(double averageLikesPerPost) {
            this.averageLikesPerPost = averageLikesPerPost;
        }

        public int getTotalLikes() {
            return totalLikes;
        }

        public void setTotalLikes(int totalLikes) {
            this.totalLikes = totalLikes;
        }

        public int getTotalPosts() {
            return totalPosts;
        }

        public void setTotalPosts(int totalPosts) {
            this.totalPosts = totalPosts;
        }

    }

    public class TaskSocial {

        @SerializedName("average_tags_per_post")
        @Expose
        private double averageTagsPerPost;

        @SerializedName("total_tags")
        @Expose
        private int totalTags;

        @SerializedName("average_links_per_post")
        @Expose
        private double averageLinksPerPost;

        @SerializedName("total_links")
        @Expose
        private int totalLinks;

        @SerializedName("average_images_per_post")
        @Expose
        private double averageImagesPerPost;

        @SerializedName("total_images")
        @Expose
        private int totalImages;

        @SerializedName("average_posts_length")
        @Expose
        private int averagePostsLength;

        @SerializedName("total_posts_length")
        @Expose
        private int totalPostsLength;

        @SerializedName("average_paid_curators")
        @Expose
        private double averagePaidCurators;

        @SerializedName("total_paid_curators")
        @Expose
        private double totalPaidCurators;

        @SerializedName("average_paid_authors")
        @Expose
        private double averagePaidAuthors;

        @SerializedName("total_paid_authors")
        @Expose
        private double totalPaidAuthors;

        @SerializedName("total_paid")
        @Expose
        private double totalPaid;

        @SerializedName("average_likes_per_post")
        @Expose
        private int averageLikesPerPost;

        @SerializedName("total_likes")
        @Expose
        private int totalLikes;

        @SerializedName("total_posts")
        @Expose
        private int totalPosts;

        public double getAverageTagsPerPost() {
            return averageTagsPerPost;
        }

        public void setAverageTagsPerPost(double averageTagsPerPost) {
            this.averageTagsPerPost = averageTagsPerPost;
        }

        public int getTotalTags() {
            return totalTags;
        }

        public void setTotalTags(int totalTags) {
            this.totalTags = totalTags;
        }

        public double getAverageLinksPerPost() {
            return averageLinksPerPost;
        }

        public void setAverageLinksPerPost(double averageLinksPerPost) {
            this.averageLinksPerPost = averageLinksPerPost;
        }

        public int getTotalLinks() {
            return totalLinks;
        }

        public void setTotalLinks(int totalLinks) {
            this.totalLinks = totalLinks;
        }

        public double getAverageImagesPerPost() {
            return averageImagesPerPost;
        }

        public void setAverageImagesPerPost(double averageImagesPerPost) {
            this.averageImagesPerPost = averageImagesPerPost;
        }

        public int getTotalImages() {
            return totalImages;
        }

        public void setTotalImages(int totalImages) {
            this.totalImages = totalImages;
        }

        public int getAveragePostsLength() {
            return averagePostsLength;
        }

        public void setAveragePostsLength(int averagePostsLength) {
            this.averagePostsLength = averagePostsLength;
        }

        public int getTotalPostsLength() {
            return totalPostsLength;
        }

        public void setTotalPostsLength(int totalPostsLength) {
            this.totalPostsLength = totalPostsLength;
        }

        public double getAveragePaidCurators() {
            return averagePaidCurators;
        }

        public void setAveragePaidCurators(double averagePaidCurators) {
            this.averagePaidCurators = averagePaidCurators;
        }

        public double getTotalPaidCurators() {
            return totalPaidCurators;
        }

        public void setTotalPaidCurators(double totalPaidCurators) {
            this.totalPaidCurators = totalPaidCurators;
        }

        public double getAveragePaidAuthors() {
            return averagePaidAuthors;
        }

        public void setAveragePaidAuthors(double averagePaidAuthors) {
            this.averagePaidAuthors = averagePaidAuthors;
        }

        public double getTotalPaidAuthors() {
            return totalPaidAuthors;
        }

        public void setTotalPaidAuthors(double totalPaidAuthors) {
            this.totalPaidAuthors = totalPaidAuthors;
        }

        public double getTotalPaid() {
            return totalPaid;
        }

        public void setTotalPaid(double totalPaid) {
            this.totalPaid = totalPaid;
        }

        public int getAverageLikesPerPost() {
            return averageLikesPerPost;
        }

        public void setAverageLikesPerPost(int averageLikesPerPost) {
            this.averageLikesPerPost = averageLikesPerPost;
        }

        public int getTotalLikes() {
            return totalLikes;
        }

        public void setTotalLikes(int totalLikes) {
            this.totalLikes = totalLikes;
        }

        public int getTotalPosts() {
            return totalPosts;
        }

        public void setTotalPosts(int totalPosts) {
            this.totalPosts = totalPosts;
        }

    }

    public class TaskTranslations {

        @SerializedName("average_tags_per_post")
        @Expose
        private int averageTagsPerPost;

        @SerializedName("total_tags")
        @Expose
        private int totalTags;

        @SerializedName("average_links_per_post")
        @Expose
        private double averageLinksPerPost;

        @SerializedName("total_links")
        @Expose
        private int totalLinks;

        @SerializedName("average_images_per_post")
        @Expose
        private int averageImagesPerPost;

        @SerializedName("total_images")
        @Expose
        private int totalImages;

        @SerializedName("average_posts_length")
        @Expose
        private double averagePostsLength;

        @SerializedName("total_posts_length")
        @Expose
        private int totalPostsLength;

        @SerializedName("average_paid_curators")
        @Expose
        private double averagePaidCurators;

        @SerializedName("total_paid_curators")
        @Expose
        private double totalPaidCurators;

        @SerializedName("average_paid_authors")
        @Expose
        private double averagePaidAuthors;

        @SerializedName("total_paid_authors")
        @Expose
        private double totalPaidAuthors;

        @SerializedName("total_paid")
        @Expose
        private double totalPaid;

        @SerializedName("average_likes_per_post")
        @Expose
        private int averageLikesPerPost;

        @SerializedName("total_likes")
        @Expose
        private int totalLikes;

        @SerializedName("total_posts")
        @Expose
        private int totalPosts;

        public int getAverageTagsPerPost() {
            return averageTagsPerPost;
        }

        public void setAverageTagsPerPost(int averageTagsPerPost) {
            this.averageTagsPerPost = averageTagsPerPost;
        }

        public int getTotalTags() {
            return totalTags;
        }

        public void setTotalTags(int totalTags) {
            this.totalTags = totalTags;
        }

        public double getAverageLinksPerPost() {
            return averageLinksPerPost;
        }

        public void setAverageLinksPerPost(double averageLinksPerPost) {
            this.averageLinksPerPost = averageLinksPerPost;
        }

        public int getTotalLinks() {
            return totalLinks;
        }

        public void setTotalLinks(int totalLinks) {
            this.totalLinks = totalLinks;
        }

        public int getAverageImagesPerPost() {
            return averageImagesPerPost;
        }

        public void setAverageImagesPerPost(int averageImagesPerPost) {
            this.averageImagesPerPost = averageImagesPerPost;
        }

        public int getTotalImages() {
            return totalImages;
        }

        public void setTotalImages(int totalImages) {
            this.totalImages = totalImages;
        }

        public double getAveragePostsLength() {
            return averagePostsLength;
        }

        public void setAveragePostsLength(double averagePostsLength) {
            this.averagePostsLength = averagePostsLength;
        }

        public int getTotalPostsLength() {
            return totalPostsLength;
        }

        public void setTotalPostsLength(int totalPostsLength) {
            this.totalPostsLength = totalPostsLength;
        }

        public double getAveragePaidCurators() {
            return averagePaidCurators;
        }

        public void setAveragePaidCurators(double averagePaidCurators) {
            this.averagePaidCurators = averagePaidCurators;
        }

        public double getTotalPaidCurators() {
            return totalPaidCurators;
        }

        public void setTotalPaidCurators(double totalPaidCurators) {
            this.totalPaidCurators = totalPaidCurators;
        }

        public double getAveragePaidAuthors() {
            return averagePaidAuthors;
        }

        public void setAveragePaidAuthors(double averagePaidAuthors) {
            this.averagePaidAuthors = averagePaidAuthors;
        }

        public double getTotalPaidAuthors() {
            return totalPaidAuthors;
        }

        public void setTotalPaidAuthors(double totalPaidAuthors) {
            this.totalPaidAuthors = totalPaidAuthors;
        }

        public double getTotalPaid() {
            return totalPaid;
        }

        public void setTotalPaid(double totalPaid) {
            this.totalPaid = totalPaid;
        }

        public int getAverageLikesPerPost() {
            return averageLikesPerPost;
        }

        public void setAverageLikesPerPost(int averageLikesPerPost) {
            this.averageLikesPerPost = averageLikesPerPost;
        }

        public int getTotalLikes() {
            return totalLikes;
        }

        public void setTotalLikes(int totalLikes) {
            this.totalLikes = totalLikes;
        }

        public int getTotalPosts() {
            return totalPosts;
        }

        public void setTotalPosts(int totalPosts) {
            this.totalPosts = totalPosts;
        }

    }

    public class Translations {

        @SerializedName("average_tags_per_post")
        @Expose
        private double averageTagsPerPost;

        @SerializedName("total_tags")
        @Expose
        private int totalTags;

        @SerializedName("average_links_per_post")
        @Expose
        private double averageLinksPerPost;

        @SerializedName("total_links")
        @Expose
        private int totalLinks;

        @SerializedName("average_images_per_post")
        @Expose
        private double averageImagesPerPost;

        @SerializedName("total_images")
        @Expose
        private int totalImages;

        @SerializedName("average_posts_length")
        @Expose
        private double averagePostsLength;

        @SerializedName("total_posts_length")
        @Expose
        private int totalPostsLength;

        @SerializedName("average_paid_curators")
        @Expose
        private double averagePaidCurators;

        @SerializedName("total_paid_curators")
        @Expose
        private double totalPaidCurators;

        @SerializedName("average_paid_authors")
        @Expose
        private double averagePaidAuthors;

        @SerializedName("total_paid_authors")
        @Expose
        private double totalPaidAuthors;

        @SerializedName("total_paid")
        @Expose
        private double totalPaid;

        @SerializedName("average_likes_per_post")
        @Expose
        private double averageLikesPerPost;

        @SerializedName("total_likes")
        @Expose
        private int totalLikes;

        @SerializedName("total_posts")
        @Expose
        private int totalPosts;

        public double getAverageTagsPerPost() {
            return averageTagsPerPost;
        }

        public void setAverageTagsPerPost(double averageTagsPerPost) {
            this.averageTagsPerPost = averageTagsPerPost;
        }

        public int getTotalTags() {
            return totalTags;
        }

        public void setTotalTags(int totalTags) {
            this.totalTags = totalTags;
        }

        public double getAverageLinksPerPost() {
            return averageLinksPerPost;
        }

        public void setAverageLinksPerPost(double averageLinksPerPost) {
            this.averageLinksPerPost = averageLinksPerPost;
        }

        public int getTotalLinks() {
            return totalLinks;
        }

        public void setTotalLinks(int totalLinks) {
            this.totalLinks = totalLinks;
        }

        public double getAverageImagesPerPost() {
            return averageImagesPerPost;
        }

        public void setAverageImagesPerPost(double averageImagesPerPost) {
            this.averageImagesPerPost = averageImagesPerPost;
        }

        public int getTotalImages() {
            return totalImages;
        }

        public void setTotalImages(int totalImages) {
            this.totalImages = totalImages;
        }

        public double getAveragePostsLength() {
            return averagePostsLength;
        }

        public void setAveragePostsLength(double averagePostsLength) {
            this.averagePostsLength = averagePostsLength;
        }

        public int getTotalPostsLength() {
            return totalPostsLength;
        }

        public void setTotalPostsLength(int totalPostsLength) {
            this.totalPostsLength = totalPostsLength;
        }

        public double getAveragePaidCurators() {
            return averagePaidCurators;
        }

        public void setAveragePaidCurators(double averagePaidCurators) {
            this.averagePaidCurators = averagePaidCurators;
        }

        public double getTotalPaidCurators() {
            return totalPaidCurators;
        }

        public void setTotalPaidCurators(double totalPaidCurators) {
            this.totalPaidCurators = totalPaidCurators;
        }

        public double getAveragePaidAuthors() {
            return averagePaidAuthors;
        }

        public void setAveragePaidAuthors(double averagePaidAuthors) {
            this.averagePaidAuthors = averagePaidAuthors;
        }

        public double getTotalPaidAuthors() {
            return totalPaidAuthors;
        }

        public void setTotalPaidAuthors(double totalPaidAuthors) {
            this.totalPaidAuthors = totalPaidAuthors;
        }

        public double getTotalPaid() {
            return totalPaid;
        }

        public void setTotalPaid(double totalPaid) {
            this.totalPaid = totalPaid;
        }

        public double getAverageLikesPerPost() {
            return averageLikesPerPost;
        }

        public void setAverageLikesPerPost(double averageLikesPerPost) {
            this.averageLikesPerPost = averageLikesPerPost;
        }

        public int getTotalLikes() {
            return totalLikes;
        }

        public void setTotalLikes(int totalLikes) {
            this.totalLikes = totalLikes;
        }

        public int getTotalPosts() {
            return totalPosts;
        }

        public void setTotalPosts(int totalPosts) {
            this.totalPosts = totalPosts;
        }

    }

    public class Tutorials {

        @SerializedName("average_tags_per_post")
        @Expose
        private double averageTagsPerPost;

        @SerializedName("total_tags")
        @Expose
        private int totalTags;

        @SerializedName("average_links_per_post")
        @Expose
        private double averageLinksPerPost;

        @SerializedName("total_links")
        @Expose
        private int totalLinks;

        @SerializedName("average_images_per_post")
        @Expose
        private double averageImagesPerPost;

        @SerializedName("total_images")
        @Expose
        private int totalImages;

        @SerializedName("average_posts_length")
        @Expose
        private double averagePostsLength;

        @SerializedName("total_posts_length")
        @Expose
        private int totalPostsLength;

        @SerializedName("average_paid_curators")
        @Expose
        private double averagePaidCurators;

        @SerializedName("total_paid_curators")
        @Expose
        private double totalPaidCurators;

        @SerializedName("average_paid_authors")
        @Expose
        private double averagePaidAuthors;

        @SerializedName("total_paid_authors")
        @Expose
        private double totalPaidAuthors;

        @SerializedName("total_paid")
        @Expose
        private double totalPaid;

        @SerializedName("average_likes_per_post")
        @Expose
        private double averageLikesPerPost;

        @SerializedName("total_likes")
        @Expose
        private int totalLikes;

        @SerializedName("total_posts")
        @Expose
        private int totalPosts;

        public double getAverageTagsPerPost() {
            return averageTagsPerPost;
        }

        public void setAverageTagsPerPost(double averageTagsPerPost) {
            this.averageTagsPerPost = averageTagsPerPost;
        }

        public int getTotalTags() {
            return totalTags;
        }

        public void setTotalTags(int totalTags) {
            this.totalTags = totalTags;
        }

        public double getAverageLinksPerPost() {
            return averageLinksPerPost;
        }

        public void setAverageLinksPerPost(double averageLinksPerPost) {
            this.averageLinksPerPost = averageLinksPerPost;
        }

        public int getTotalLinks() {
            return totalLinks;
        }

        public void setTotalLinks(int totalLinks) {
            this.totalLinks = totalLinks;
        }

        public double getAverageImagesPerPost() {
            return averageImagesPerPost;
        }

        public void setAverageImagesPerPost(double averageImagesPerPost) {
            this.averageImagesPerPost = averageImagesPerPost;
        }

        public int getTotalImages() {
            return totalImages;
        }

        public void setTotalImages(int totalImages) {
            this.totalImages = totalImages;
        }

        public double getAveragePostsLength() {
            return averagePostsLength;
        }

        public void setAveragePostsLength(double averagePostsLength) {
            this.averagePostsLength = averagePostsLength;
        }

        public int getTotalPostsLength() {
            return totalPostsLength;
        }

        public void setTotalPostsLength(int totalPostsLength) {
            this.totalPostsLength = totalPostsLength;
        }

        public double getAveragePaidCurators() {
            return averagePaidCurators;
        }

        public void setAveragePaidCurators(double averagePaidCurators) {
            this.averagePaidCurators = averagePaidCurators;
        }

        public double getTotalPaidCurators() {
            return totalPaidCurators;
        }

        public void setTotalPaidCurators(double totalPaidCurators) {
            this.totalPaidCurators = totalPaidCurators;
        }

        public double getAveragePaidAuthors() {
            return averagePaidAuthors;
        }

        public void setAveragePaidAuthors(double averagePaidAuthors) {
            this.averagePaidAuthors = averagePaidAuthors;
        }

        public double getTotalPaidAuthors() {
            return totalPaidAuthors;
        }

        public void setTotalPaidAuthors(double totalPaidAuthors) {
            this.totalPaidAuthors = totalPaidAuthors;
        }

        public double getTotalPaid() {
            return totalPaid;
        }

        public void setTotalPaid(double totalPaid) {
            this.totalPaid = totalPaid;
        }

        public double getAverageLikesPerPost() {
            return averageLikesPerPost;
        }

        public void setAverageLikesPerPost(double averageLikesPerPost) {
            this.averageLikesPerPost = averageLikesPerPost;
        }

        public int getTotalLikes() {
            return totalLikes;
        }

        public void setTotalLikes(int totalLikes) {
            this.totalLikes = totalLikes;
        }

        public int getTotalPosts() {
            return totalPosts;
        }

        public void setTotalPosts(int totalPosts) {
            this.totalPosts = totalPosts;
        }

    }

    public class VideoTutorials {

        @SerializedName("average_tags_per_post")
        @Expose
        private double averageTagsPerPost;

        @SerializedName("total_tags")
        @Expose
        private int totalTags;

        @SerializedName("average_links_per_post")
        @Expose
        private double averageLinksPerPost;

        @SerializedName("total_links")
        @Expose
        private int totalLinks;

        @SerializedName("average_images_per_post")
        @Expose
        private double averageImagesPerPost;

        @SerializedName("total_images")
        @Expose
        private int totalImages;

        @SerializedName("average_posts_length")
        @Expose
        private double averagePostsLength;

        @SerializedName("total_posts_length")
        @Expose
        private int totalPostsLength;

        @SerializedName("average_paid_curators")
        @Expose
        private double averagePaidCurators;

        @SerializedName("total_paid_curators")
        @Expose
        private double totalPaidCurators;

        @SerializedName("average_paid_authors")
        @Expose
        private double averagePaidAuthors;

        @SerializedName("total_paid_authors")
        @Expose
        private double totalPaidAuthors;

        @SerializedName("total_paid")
        @Expose
        private double totalPaid;

        @SerializedName("average_likes_per_post")
        @Expose
        private double averageLikesPerPost;

        @SerializedName("total_likes")
        @Expose
        private int totalLikes;

        @SerializedName("total_posts")
        @Expose
        private int totalPosts;

        public double getAverageTagsPerPost() {
            return averageTagsPerPost;
        }

        public void setAverageTagsPerPost(double averageTagsPerPost) {
            this.averageTagsPerPost = averageTagsPerPost;
        }

        public int getTotalTags() {
            return totalTags;
        }

        public void setTotalTags(int totalTags) {
            this.totalTags = totalTags;
        }

        public double getAverageLinksPerPost() {
            return averageLinksPerPost;
        }

        public void setAverageLinksPerPost(double averageLinksPerPost) {
            this.averageLinksPerPost = averageLinksPerPost;
        }

        public int getTotalLinks() {
            return totalLinks;
        }

        public void setTotalLinks(int totalLinks) {
            this.totalLinks = totalLinks;
        }

        public double getAverageImagesPerPost() {
            return averageImagesPerPost;
        }

        public void setAverageImagesPerPost(double averageImagesPerPost) {
            this.averageImagesPerPost = averageImagesPerPost;
        }

        public int getTotalImages() {
            return totalImages;
        }

        public void setTotalImages(int totalImages) {
            this.totalImages = totalImages;
        }

        public double getAveragePostsLength() {
            return averagePostsLength;
        }

        public void setAveragePostsLength(double averagePostsLength) {
            this.averagePostsLength = averagePostsLength;
        }

        public int getTotalPostsLength() {
            return totalPostsLength;
        }

        public void setTotalPostsLength(int totalPostsLength) {
            this.totalPostsLength = totalPostsLength;
        }

        public double getAveragePaidCurators() {
            return averagePaidCurators;
        }

        public void setAveragePaidCurators(double averagePaidCurators) {
            this.averagePaidCurators = averagePaidCurators;
        }

        public double getTotalPaidCurators() {
            return totalPaidCurators;
        }

        public void setTotalPaidCurators(double totalPaidCurators) {
            this.totalPaidCurators = totalPaidCurators;
        }

        public double getAveragePaidAuthors() {
            return averagePaidAuthors;
        }

        public void setAveragePaidAuthors(double averagePaidAuthors) {
            this.averagePaidAuthors = averagePaidAuthors;
        }

        public double getTotalPaidAuthors() {
            return totalPaidAuthors;
        }

        public void setTotalPaidAuthors(double totalPaidAuthors) {
            this.totalPaidAuthors = totalPaidAuthors;
        }

        public double getTotalPaid() {
            return totalPaid;
        }

        public void setTotalPaid(double totalPaid) {
            this.totalPaid = totalPaid;
        }

        public double getAverageLikesPerPost() {
            return averageLikesPerPost;
        }

        public void setAverageLikesPerPost(double averageLikesPerPost) {
            this.averageLikesPerPost = averageLikesPerPost;
        }

        public int getTotalLikes() {
            return totalLikes;
        }

        public void setTotalLikes(int totalLikes) {
            this.totalLikes = totalLikes;
        }

        public int getTotalPosts() {
            return totalPosts;
        }

        public void setTotalPosts(int totalPosts) {
            this.totalPosts = totalPosts;
        }

    }
}

