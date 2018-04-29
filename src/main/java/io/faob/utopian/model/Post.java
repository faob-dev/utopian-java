package io.faob.utopian.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Post {

    @SerializedName("moderator")
    @Expose
    private String moderator;

    @SerializedName("flagged")
    @Expose
    private boolean flagged;

    @SerializedName("reviewed")
    @Expose
    private boolean reviewed;

    @SerializedName("pending")
    @Expose
    private boolean pending;

    @SerializedName("_id")
    @Expose
    private String _id;

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("author")
    @Expose
    private String author;

    @SerializedName("permlink")
    @Expose
    private String permlink;

    @SerializedName("category")
    @Expose
    private String category;

    @SerializedName("parent_author")
    @Expose
    private String parentAuthor;

    @SerializedName("parent_permlink")
    @Expose
    private String parentPermlink;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("body")
    @Expose
    private String body;

    @SerializedName("json_metadata")
    @Expose
    private JsonMetadata jsonMetadata;

    @SerializedName("last_update")
    @Expose
    private String lastUpdate;

    @SerializedName("created")
    @Expose
    private String created;

    @SerializedName("active")
    @Expose
    private String active;

    @SerializedName("last_payout")
    @Expose
    private String lastPayout;

    @SerializedName("depth")
    @Expose
    private int depth;

    @SerializedName("children")
    @Expose
    private int children;

    @SerializedName("net_rshares")
    @Expose
    private long netRshares;

    @SerializedName("abs_rshares")
    @Expose
    private long absRshares;

    @SerializedName("vote_rshares")
    @Expose
    private long voteRshares;

    @SerializedName("children_abs_rshares")
    @Expose
    private long childrenAbsRshares;

    @SerializedName("cashout_time")
    @Expose
    private String cashoutTime;

    @SerializedName("max_cashout_time")
    @Expose
    private String maxCashoutTime;

    @SerializedName("total_vote_weight")
    @Expose
    private int totalVoteWeight;

    @SerializedName("reward_weight")
    @Expose
    private int rewardWeight;

    @SerializedName("total_payout_value")
    @Expose
    private String totalPayoutValue;

    @SerializedName("curator_payout_value")
    @Expose
    private String curatorPayoutValue;

    @SerializedName("author_rewards")
    @Expose
    private int authorRewards;

    @SerializedName("net_votes")
    @Expose
    private int netVotes;

    @SerializedName("max_accepted_payout")
    @Expose
    private String maxAcceptedPayout;

    @SerializedName("percent_steem_dollars")
    @Expose
    private int percentSteemDollars;

    @SerializedName("allow_replies")
    @Expose
    private boolean allowReplies;

    @SerializedName("allow_votes")
    @Expose
    private boolean allowVotes;

    @SerializedName("allow_curation_rewards")
    @Expose
    private boolean allowCurationRewards;

    @SerializedName("url")
    @Expose
    private String url;

    @SerializedName("root_title")
    @Expose
    private String rootTitle;

    @SerializedName("pending_payout_value")
    @Expose
    private String pendingPayoutValue;

    @SerializedName("total_pending_payout_value")
    @Expose
    private String totalPendingPayoutValue;

    @SerializedName("author_reputation")
    @Expose
    private long authorReputation;

    @SerializedName("promoted")
    @Expose
    private String promoted;

    @SerializedName("body_length")
    @Expose
    private int bodyLength;

    @SerializedName("__v")
    @Expose
    private int v = -1;

    @SerializedName("reserved")
    @Expose
    private boolean reserved;

    @SerializedName("replies")
    @Expose
    private List<Object> replies = null;

    @SerializedName("reblogged_by")
    @Expose
    private List<Object> rebloggedBy = null;

    @SerializedName("beneficiaries")
    @Expose
    private List<Beneficiary> beneficiaries = null;

    @SerializedName("deleted")
    @Expose
    private boolean deleted;

    @SerializedName("active_votes")
    @Expose
    private List<ActiveVote> activeVotes = null;

    public String getModerator() {
        return moderator;
    }

    public void setModerator(String moderator) {
        this.moderator = moderator;
    }

    public boolean isFlagged() {
        return flagged;
    }

    public void setFlagged(boolean flagged) {
        this.flagged = flagged;
    }

    public boolean isReviewed() {
        return reviewed;
    }

    public void setReviewed(boolean reviewed) {
        this.reviewed = reviewed;
    }

    public boolean isPending() {
        return pending;
    }

    public void setPending(boolean pending) {
        this.pending = pending;
    }

    public String get_Id() {
        return _id;
    }

    public void set_Id(String _id) {
        this._id = _id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPermlink() {
        return permlink;
    }

    public void setPermlink(String permlink) {
        this.permlink = permlink;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getParentAuthor() {
        return parentAuthor;
    }

    public void setParentAuthor(String parentAuthor) {
        this.parentAuthor = parentAuthor;
    }

    public String getParentPermlink() {
        return parentPermlink;
    }

    public void setParentPermlink(String parentPermlink) {
        this.parentPermlink = parentPermlink;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public JsonMetadata getJsonMetadata() {
        return jsonMetadata;
    }

    public void setJsonMetadata(JsonMetadata jsonMetadata) {
        this.jsonMetadata = jsonMetadata;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getLastPayout() {
        return lastPayout;
    }

    public void setLastPayout(String lastPayout) {
        this.lastPayout = lastPayout;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public long getNetRshares() {
        return netRshares;
    }

    public void setNetRshares(long netRshares) {
        this.netRshares = netRshares;
    }

    public long getAbsRshares() {
        return absRshares;
    }

    public void setAbsRshares(long absRshares) {
        this.absRshares = absRshares;
    }

    public long getVoteRshares() {
        return voteRshares;
    }

    public void setVoteRshares(long voteRshares) {
        this.voteRshares = voteRshares;
    }

    public long getChildrenAbsRshares() {
        return childrenAbsRshares;
    }

    public void setChildrenAbsRshares(long childrenAbsRshares) {
        this.childrenAbsRshares = childrenAbsRshares;
    }

    public String getCashoutTime() {
        return cashoutTime;
    }

    public void setCashoutTime(String cashoutTime) {
        this.cashoutTime = cashoutTime;
    }

    public String getMaxCashoutTime() {
        return maxCashoutTime;
    }

    public void setMaxCashoutTime(String maxCashoutTime) {
        this.maxCashoutTime = maxCashoutTime;
    }

    public int getTotalVoteWeight() {
        return totalVoteWeight;
    }

    public void setTotalVoteWeight(int totalVoteWeight) {
        this.totalVoteWeight = totalVoteWeight;
    }

    public int getRewardWeight() {
        return rewardWeight;
    }

    public void setRewardWeight(int rewardWeight) {
        this.rewardWeight = rewardWeight;
    }

    public String getTotalPayoutValue() {
        return totalPayoutValue;
    }

    public void setTotalPayoutValue(String totalPayoutValue) {
        this.totalPayoutValue = totalPayoutValue;
    }

    public String getCuratorPayoutValue() {
        return curatorPayoutValue;
    }

    public void setCuratorPayoutValue(String curatorPayoutValue) {
        this.curatorPayoutValue = curatorPayoutValue;
    }

    public int getAuthorRewards() {
        return authorRewards;
    }

    public void setAuthorRewards(int authorRewards) {
        this.authorRewards = authorRewards;
    }

    public int getNetVotes() {
        return netVotes;
    }

    public void setNetVotes(int netVotes) {
        this.netVotes = netVotes;
    }

    public String getMaxAcceptedPayout() {
        return maxAcceptedPayout;
    }

    public void setMaxAcceptedPayout(String maxAcceptedPayout) {
        this.maxAcceptedPayout = maxAcceptedPayout;
    }

    public int getPercentSteemDollars() {
        return percentSteemDollars;
    }

    public void setPercentSteemDollars(int percentSteemDollars) {
        this.percentSteemDollars = percentSteemDollars;
    }

    public boolean isAllowReplies() {
        return allowReplies;
    }

    public void setAllowReplies(boolean allowReplies) {
        this.allowReplies = allowReplies;
    }

    public boolean isAllowVotes() {
        return allowVotes;
    }

    public void setAllowVotes(boolean allowVotes) {
        this.allowVotes = allowVotes;
    }

    public boolean isAllowCurationRewards() {
        return allowCurationRewards;
    }

    public void setAllowCurationRewards(boolean allowCurationRewards) {
        this.allowCurationRewards = allowCurationRewards;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRootTitle() {
        return rootTitle;
    }

    public void setRootTitle(String rootTitle) {
        this.rootTitle = rootTitle;
    }

    public String getPendingPayoutValue() {
        return pendingPayoutValue;
    }

    public void setPendingPayoutValue(String pendingPayoutValue) {
        this.pendingPayoutValue = pendingPayoutValue;
    }

    public String getTotalPendingPayoutValue() {
        return totalPendingPayoutValue;
    }

    public void setTotalPendingPayoutValue(String totalPendingPayoutValue) {
        this.totalPendingPayoutValue = totalPendingPayoutValue;
    }

    public long getAuthorReputation() {
        return authorReputation;
    }

    public void setAuthorReputation(long authorReputation) {
        this.authorReputation = authorReputation;
    }

    public String getPromoted() {
        return promoted;
    }

    public void setPromoted(String promoted) {
        this.promoted = promoted;
    }

    public int getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(int bodyLength) {
        this.bodyLength = bodyLength;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public List<Object> getReplies() {
        return replies;
    }

    public void setReplies(List<Object> replies) {
        this.replies = replies;
    }

    public List<Object> getRebloggedBy() {
        return rebloggedBy;
    }

    public void setRebloggedBy(List<Object> rebloggedBy) {
        this.rebloggedBy = rebloggedBy;
    }

    public List<Beneficiary> getBeneficiaries() {
        return beneficiaries;
    }

    public void setBeneficiaries(List<Beneficiary> beneficiaries) {
        this.beneficiaries = beneficiaries;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public List<ActiveVote> getActiveVotes() {
        return activeVotes;
    }

    public void setActiveVotes(List<ActiveVote> activeVotes) {
        this.activeVotes = activeVotes;
    }

    public class ActiveVote {

        @SerializedName("time")
        @Expose
        private String time;

        @SerializedName("reputation")
        @Expose
        private long reputation;

        @SerializedName("percent")
        @Expose
        private int percent;

        @SerializedName("rshares")
        @Expose
        private long rshares;

        @SerializedName("weight")
        @Expose
        private int weight;

        @SerializedName("voter")
        @Expose
        private String voter;

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public long getReputation() {
            return reputation;
        }

        public void setReputation(long reputation) {
            this.reputation = reputation;
        }

        public int getPercent() {
            return percent;
        }

        public void setPercent(int percent) {
            this.percent = percent;
        }

        public long getRshares() {
            return rshares;
        }

        public void setRshares(long rshares) {
            this.rshares = rshares;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public String getVoter() {
            return voter;
        }

        public void setVoter(String voter) {
            this.voter = voter;
        }

    }

    public class Beneficiary {

        @SerializedName("account")
        @Expose
        private String account;

        @SerializedName("weight")
        @Expose
        private int weight;

        public String getAccount() {
            return account;
        }

        public void setAccount(String account) {
            this.account = account;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

    }

    public class JsonMetadata {

        @SerializedName("config")
        @Expose
        private Config config;

        @SerializedName("staff_pick_by")
        @Expose
        private Object staffPickBy;

        @SerializedName("staff_pick")
        @Expose
        private Object staffPick;

        @SerializedName("total_influence")
        @Expose
        private long totalInfluence;

        @SerializedName("score")
        @Expose
        private long score;

        private Questions questions = null;

        private List<Question> questions_ = null;

        @SerializedName("moderator")
        @Expose
        private Moderator moderator;

        @SerializedName("image")
        @Expose
        private List<String> image = null;

        @SerializedName("links")
        @Expose
        private List<String> links = null;

        @SerializedName("users")
        @Expose
        private List<String> users = null;

        @SerializedName("tags")
        @Expose
        private List<String> tags = null;

        @SerializedName("type")
        @Expose
        private String type;

        @SerializedName("platform")
        @Expose
        private String platform;

        @SerializedName("pullRequests")
        @Expose
        private List<Object> pullRequests = null;

        @SerializedName("repository")
        @Expose
        private Repository repository;

        @SerializedName("format")
        @Expose
        private String format;

        @SerializedName("app")
        @Expose
        private String app;

        @SerializedName("community")
        @Expose
        private String community;

        public Config getConfig() {
            return config;
        }

        public void setConfig(Config config) {
            this.config = config;
        }

        public Object getStaffPickBy() {
            return staffPickBy;
        }

        public void setStaffPickBy(Object staffPickBy) {
            this.staffPickBy = staffPickBy;
        }

        public Object getStaffPick() {
            return staffPick;
        }

        public void setStaffPick(Object staffPick) {
            this.staffPick = staffPick;
        }

        public long getTotalInfluence() {
            return totalInfluence;
        }

        public void setTotalInfluence(long totalInfluence) {
            this.totalInfluence = totalInfluence;
        }

        public long getScore() {
            return score;
        }

        public void setScore(long score) {
            this.score = score;
        }

        public Questions getQuestionsObject() {
            return questions;
        }

        public void setQuestionsObject(Questions questions) {
            this.questions = questions;
        }

        public List<Question> getQuestionsArray() {
            return questions_;
        }

        public void setQuestionsArray(List<Question> questions_) {
            this.questions_ = questions_;
        }

        public Moderator getModerator() {
            return moderator;
        }

        public void setModerator(Moderator moderator) {
            this.moderator = moderator;
        }

        public List<String> getImage() {
            return image;
        }

        public void setImage(List<String> image) {
            this.image = image;
        }

        public List<String> getLinks() {
            return links;
        }

        public void setLinks(List<String> links) {
            this.links = links;
        }

        public List<String> getUsers() {
            return users;
        }

        public void setUsers(List<String> users) {
            this.users = users;
        }

        public List<String> getTags() {
            return tags;
        }

        public void setTags(List<String> tags) {
            this.tags = tags;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getPlatform() {
            return platform;
        }

        public void setPlatform(String platform) {
            this.platform = platform;
        }

        public List<Object> getPullRequests() {
            return pullRequests;
        }

        public void setPullRequests(List<Object> pullRequests) {
            this.pullRequests = pullRequests;
        }

        public Repository getRepository() {
            return repository;
        }

        public void setRepository(Repository repository) {
            this.repository = repository;
        }

        public String getFormat() {
            return format;
        }

        public void setFormat(String format) {
            this.format = format;
        }

        public String getApp() {
            return app;
        }

        public void setApp(String app) {
            this.app = app;
        }

        public String getCommunity() {
            return community;
        }

        public void setCommunity(String community) {
            this.community = community;
        }

        public class Config {

            @SerializedName("questions")
            @Expose
            private List<Question> questions = null;

            public List<Question> getQuestions() {
                return questions;
            }

            public void setQuestions(List<Question> questions) {
                this.questions = questions;
            }

            public class Question {

                @SerializedName("answers")
                @Expose
                private List<Answer> answers = null;

                @SerializedName("question_id")
                @Expose
                private String questionId;

                @SerializedName("question")
                @Expose
                private String question;

                public List<Answer> getAnswers() {
                    return answers;
                }

                public void setAnswers(List<Answer> answers) {
                    this.answers = answers;
                }

                public String getQuestionId() {
                    return questionId;
                }

                public void setQuestionId(String questionId) {
                    this.questionId = questionId;
                }

                public String getQuestion() {
                    return question;
                }

                public void setQuestion(String question) {
                    this.question = question;
                }

            }

            public class Answer {

                @SerializedName("value")
                @Expose
                private double value;

                @SerializedName("answer_id")
                @Expose
                private String answerId;

                @SerializedName("answer")
                @Expose
                private String answer;

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }

                public String getAnswerId() {
                    return answerId;
                }

                public void setAnswerId(String answerId) {
                    this.answerId = answerId;
                }

                public String getAnswer() {
                    return answer;
                }

                public void setAnswer(String answer) {
                    this.answer = answer;
                }

            }
        }

        public class Question {

            @SerializedName("selected")
            @Expose
            private long selected;

            @SerializedName("answers")
            @Expose
            private List<Answer> answers = null;

            @SerializedName("question")
            @Expose
            private String question;

            public long getSelected() {
                return selected;
            }

            public void setSelected(long selected) {
                this.selected = selected;
            }

            public List<Answer> getAnswers() {
                return answers;
            }

            public void setAnswers(List<Answer> answers) {
                this.answers = answers;
            }

            public String getQuestion() {
                return question;
            }

            public void setQuestion(String question) {
                this.question = question;
            }

            public class Answer {

                @SerializedName("score")
                @Expose
                private long score;

                @SerializedName("selected")
                @Expose
                private boolean selected;

                @SerializedName("value")
                @Expose
                private String value;

                public long getScore() {
                    return score;
                }

                public void setScore(long score) {
                    this.score = score;
                }

                public boolean isSelected() {
                    return selected;
                }

                public void setSelected(boolean selected) {
                    this.selected = selected;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }
        }

        public class Questions {

            @SerializedName("most_rated")
            @Expose
            private List<MostRated> mostRated = null;

            @SerializedName("total_influence")
            @Expose
            private long totalInfluence;

            @SerializedName("answers")
            @Expose
            private List<Answer> answers = null;

            @SerializedName("voters")
            @Expose
            private List<String> voters = null;

            public List<MostRated> getMostRated() {
                return mostRated;
            }

            public void setMostRated(List<MostRated> mostRated) {
                this.mostRated = mostRated;
            }

            public long getTotalInfluence() {
                return totalInfluence;
            }

            public void setTotalInfluence(long totalInfluence) {
                this.totalInfluence = totalInfluence;
            }

            public List<Answer> getAnswers() {
                return answers;
            }

            public void setAnswers(List<Answer> answers) {
                this.answers = answers;
            }

            public List<String> getVoters() {
                return voters;
            }

            public void setVoters(List<String> voters) {
                this.voters = voters;
            }

            public class MostRated {

                @SerializedName("voters")
                @Expose
                private List<String> voters = null;

                @SerializedName("influence")
                @Expose
                private long influence;

                @SerializedName("answer_id")
                @Expose
                private String answerId;

                @SerializedName("question_id")
                @Expose
                private String questionId;

                public List<String> getVoters() {
                    return voters;
                }

                public void setVoters(List<String> voters) {
                    this.voters = voters;
                }

                public long getInfluence() {
                    return influence;
                }

                public void setInfluence(long influence) {
                    this.influence = influence;
                }

                public String getAnswerId() {
                    return answerId;
                }

                public void setAnswerId(String answerId) {
                    this.answerId = answerId;
                }

                public String getQuestionId() {
                    return questionId;
                }

                public void setQuestionId(String questionId) {
                    this.questionId = questionId;
                }

            }

            public class Answer {

                @SerializedName("influence")
                @Expose
                private long influence;

                @SerializedName("user")
                @Expose
                private String user;

                @SerializedName("answer_id")
                @Expose
                private String answerId;

                @SerializedName("question_id")
                @Expose
                private String questionId;

                public long getInfluence() {
                    return influence;
                }

                public void setInfluence(long influence) {
                    this.influence = influence;
                }

                public String getUser() {
                    return user;
                }

                public void setUser(String user) {
                    this.user = user;
                }

                public String getAnswerId() {
                    return answerId;
                }

                public void setAnswerId(String answerId) {
                    this.answerId = answerId;
                }

                public String getQuestionId() {
                    return questionId;
                }

                public void setQuestionId(String questionId) {
                    this.questionId = questionId;
                }
            }

        }

        public class Repository {

            @SerializedName("owner")
            @Expose
            private Owner owner;

            @SerializedName("fork")
            @Expose
            private boolean fork;

            @SerializedName("html_url")
            @Expose
            private String htmlUrl;

            @SerializedName("full_name")
            @Expose
            private String fullName;

            @SerializedName("name")
            @Expose
            private String name;

            @SerializedName("id")
            @Expose
            private int id;

            public Owner getOwner() {
                return owner;
            }

            public void setOwner(Owner owner) {
                this.owner = owner;
            }

            public boolean isFork() {
                return fork;
            }

            public void setFork(boolean fork) {
                this.fork = fork;
            }

            public String getHtmlUrl() {
                return htmlUrl;
            }

            public void setHtmlUrl(String htmlUrl) {
                this.htmlUrl = htmlUrl;
            }

            public String getFullName() {
                return fullName;
            }

            public void setFullName(String fullName) {
                this.fullName = fullName;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public class Owner {

                @SerializedName("login")
                @Expose
                private String login;

                public String getLogin() {
                    return login;
                }

                public void setLogin(String login) {
                    this.login = login;
                }

            }

        }

        public class Moderator {

            @SerializedName("flagged")
            @Expose
            private boolean flagged;

            @SerializedName("pending")
            @Expose
            private boolean pending;

            @SerializedName("reviewed")
            @Expose
            private boolean reviewed;

            @SerializedName("time")
            @Expose
            private String time;

            @SerializedName("account")
            @Expose
            private String account;

            public boolean isFlagged() {
                return flagged;
            }

            public void setFlagged(boolean flagged) {
                this.flagged = flagged;
            }

            public boolean isPending() {
                return pending;
            }

            public void setPending(boolean pending) {
                this.pending = pending;
            }

            public boolean isReviewed() {
                return reviewed;
            }

            public void setReviewed(boolean reviewed) {
                this.reviewed = reviewed;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getAccount() {
                return account;
            }

            public void setAccount(String account) {
                this.account = account;
            }

        }
    }

}