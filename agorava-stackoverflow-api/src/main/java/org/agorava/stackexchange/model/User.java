
package org.agorava.stackexchange.model;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "user_id",
    "user_type",
    "creation_date",
    "display_name",
    "profile_image",
    "reputation",
    "reputation_change_day",
    "reputation_change_week",
    "reputation_change_month",
    "reputation_change_quarter",
    "reputation_change_year",
    "age",
    "last_access_date",
    "last_modified_date",
    "is_employee",
    "link",
    "website_url",
    "location",
    "account_id",
    "badge_counts",
    "question_count",
    "answer_count",
    "up_vote_count",
    "down_vote_count",
    "about_me",
    "view_count",
    "accept_rate"
})
public class User {

    @JsonProperty("user_id")
    private Integer userId;
    @JsonProperty("user_type")
    private UserType userType;
    @JsonProperty("creation_date")
    private Integer creationDate;
    @JsonProperty("display_name")
    private String displayName;
    @JsonProperty("profile_image")
    private String profileImage;
    @JsonProperty("reputation")
    private Integer reputation;
    @JsonProperty("reputation_change_day")
    private Integer reputationChangeDay;
    @JsonProperty("reputation_change_week")
    private Integer reputationChangeWeek;
    @JsonProperty("reputation_change_month")
    private Integer reputationChangeMonth;
    @JsonProperty("reputation_change_quarter")
    private Integer reputationChangeQuarter;
    @JsonProperty("reputation_change_year")
    private Integer reputationChangeYear;
    @JsonProperty("age")
    private Integer age;
    @JsonProperty("last_access_date")
    private Integer lastAccessDate;
    @JsonProperty("last_modified_date")
    private Integer lastModifiedDate;
    @JsonProperty("is_employee")
    private Boolean isEmployee;
    @JsonProperty("link")
    private String link;
    @JsonProperty("website_url")
    private String websiteUrl;
    @JsonProperty("location")
    private String location;
    @JsonProperty("account_id")
    private Integer accountId;
    @JsonProperty("badge_counts")
    private BadgeCounts badgeCounts;
    @JsonProperty("question_count")
    private Integer questionCount;
    @JsonProperty("answer_count")
    private Integer answerCount;
    @JsonProperty("up_vote_count")
    private Integer upVoteCount;
    @JsonProperty("down_vote_count")
    private Integer downVoteCount;
    @JsonProperty("about_me")
    private String aboutMe;
    @JsonProperty("view_count")
    private Integer viewCount;
    @JsonProperty("accept_rate")
    private Integer acceptRate;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("user_id")
    public Integer getUserId() {
        return userId;
    }

    @JsonProperty("user_id")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public User withUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    @JsonProperty("user_type")
    public UserType getUserType() {
        return userType;
    }

    @JsonProperty("user_type")
    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public User withUserType(UserType userType) {
        this.userType = userType;
        return this;
    }

    @JsonProperty("creation_date")
    public Integer getCreationDate() {
        return creationDate;
    }

    @JsonProperty("creation_date")
    public void setCreationDate(Integer creationDate) {
        this.creationDate = creationDate;
    }

    public User withCreationDate(Integer creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("display_name")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public User withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    @JsonProperty("profile_image")
    public String getProfileImage() {
        return profileImage;
    }

    @JsonProperty("profile_image")
    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public User withProfileImage(String profileImage) {
        this.profileImage = profileImage;
        return this;
    }

    @JsonProperty("reputation")
    public Integer getReputation() {
        return reputation;
    }

    @JsonProperty("reputation")
    public void setReputation(Integer reputation) {
        this.reputation = reputation;
    }

    public User withReputation(Integer reputation) {
        this.reputation = reputation;
        return this;
    }

    @JsonProperty("reputation_change_day")
    public Integer getReputationChangeDay() {
        return reputationChangeDay;
    }

    @JsonProperty("reputation_change_day")
    public void setReputationChangeDay(Integer reputationChangeDay) {
        this.reputationChangeDay = reputationChangeDay;
    }

    public User withReputationChangeDay(Integer reputationChangeDay) {
        this.reputationChangeDay = reputationChangeDay;
        return this;
    }

    @JsonProperty("reputation_change_week")
    public Integer getReputationChangeWeek() {
        return reputationChangeWeek;
    }

    @JsonProperty("reputation_change_week")
    public void setReputationChangeWeek(Integer reputationChangeWeek) {
        this.reputationChangeWeek = reputationChangeWeek;
    }

    public User withReputationChangeWeek(Integer reputationChangeWeek) {
        this.reputationChangeWeek = reputationChangeWeek;
        return this;
    }

    @JsonProperty("reputation_change_month")
    public Integer getReputationChangeMonth() {
        return reputationChangeMonth;
    }

    @JsonProperty("reputation_change_month")
    public void setReputationChangeMonth(Integer reputationChangeMonth) {
        this.reputationChangeMonth = reputationChangeMonth;
    }

    public User withReputationChangeMonth(Integer reputationChangeMonth) {
        this.reputationChangeMonth = reputationChangeMonth;
        return this;
    }

    @JsonProperty("reputation_change_quarter")
    public Integer getReputationChangeQuarter() {
        return reputationChangeQuarter;
    }

    @JsonProperty("reputation_change_quarter")
    public void setReputationChangeQuarter(Integer reputationChangeQuarter) {
        this.reputationChangeQuarter = reputationChangeQuarter;
    }

    public User withReputationChangeQuarter(Integer reputationChangeQuarter) {
        this.reputationChangeQuarter = reputationChangeQuarter;
        return this;
    }

    @JsonProperty("reputation_change_year")
    public Integer getReputationChangeYear() {
        return reputationChangeYear;
    }

    @JsonProperty("reputation_change_year")
    public void setReputationChangeYear(Integer reputationChangeYear) {
        this.reputationChangeYear = reputationChangeYear;
    }

    public User withReputationChangeYear(Integer reputationChangeYear) {
        this.reputationChangeYear = reputationChangeYear;
        return this;
    }

    @JsonProperty("age")
    public Integer getAge() {
        return age;
    }

    @JsonProperty("age")
    public void setAge(Integer age) {
        this.age = age;
    }

    public User withAge(Integer age) {
        this.age = age;
        return this;
    }

    @JsonProperty("last_access_date")
    public Integer getLastAccessDate() {
        return lastAccessDate;
    }

    @JsonProperty("last_access_date")
    public void setLastAccessDate(Integer lastAccessDate) {
        this.lastAccessDate = lastAccessDate;
    }

    public User withLastAccessDate(Integer lastAccessDate) {
        this.lastAccessDate = lastAccessDate;
        return this;
    }

    @JsonProperty("last_modified_date")
    public Integer getLastModifiedDate() {
        return lastModifiedDate;
    }

    @JsonProperty("last_modified_date")
    public void setLastModifiedDate(Integer lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public User withLastModifiedDate(Integer lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    @JsonProperty("is_employee")
    public Boolean getIsEmployee() {
        return isEmployee;
    }

    @JsonProperty("is_employee")
    public void setIsEmployee(Boolean isEmployee) {
        this.isEmployee = isEmployee;
    }

    public User withIsEmployee(Boolean isEmployee) {
        this.isEmployee = isEmployee;
        return this;
    }

    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
    }

    public User withLink(String link) {
        this.link = link;
        return this;
    }

    @JsonProperty("website_url")
    public String getWebsiteUrl() {
        return websiteUrl;
    }

    @JsonProperty("website_url")
    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public User withWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
        return this;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    public User withLocation(String location) {
        this.location = location;
        return this;
    }

    @JsonProperty("account_id")
    public Integer getAccountId() {
        return accountId;
    }

    @JsonProperty("account_id")
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public User withAccountId(Integer accountId) {
        this.accountId = accountId;
        return this;
    }

    @JsonProperty("badge_counts")
    public BadgeCounts getBadgeCounts() {
        return badgeCounts;
    }

    @JsonProperty("badge_counts")
    public void setBadgeCounts(BadgeCounts badgeCounts) {
        this.badgeCounts = badgeCounts;
    }

    public User withBadgeCounts(BadgeCounts badgeCounts) {
        this.badgeCounts = badgeCounts;
        return this;
    }

    @JsonProperty("question_count")
    public Integer getQuestionCount() {
        return questionCount;
    }

    @JsonProperty("question_count")
    public void setQuestionCount(Integer questionCount) {
        this.questionCount = questionCount;
    }

    public User withQuestionCount(Integer questionCount) {
        this.questionCount = questionCount;
        return this;
    }

    @JsonProperty("answer_count")
    public Integer getAnswerCount() {
        return answerCount;
    }

    @JsonProperty("answer_count")
    public void setAnswerCount(Integer answerCount) {
        this.answerCount = answerCount;
    }

    public User withAnswerCount(Integer answerCount) {
        this.answerCount = answerCount;
        return this;
    }

    @JsonProperty("up_vote_count")
    public Integer getUpVoteCount() {
        return upVoteCount;
    }

    @JsonProperty("up_vote_count")
    public void setUpVoteCount(Integer upVoteCount) {
        this.upVoteCount = upVoteCount;
    }

    public User withUpVoteCount(Integer upVoteCount) {
        this.upVoteCount = upVoteCount;
        return this;
    }

    @JsonProperty("down_vote_count")
    public Integer getDownVoteCount() {
        return downVoteCount;
    }

    @JsonProperty("down_vote_count")
    public void setDownVoteCount(Integer downVoteCount) {
        this.downVoteCount = downVoteCount;
    }

    public User withDownVoteCount(Integer downVoteCount) {
        this.downVoteCount = downVoteCount;
        return this;
    }

    @JsonProperty("about_me")
    public String getAboutMe() {
        return aboutMe;
    }

    @JsonProperty("about_me")
    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public User withAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
        return this;
    }

    @JsonProperty("view_count")
    public Integer getViewCount() {
        return viewCount;
    }

    @JsonProperty("view_count")
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public User withViewCount(Integer viewCount) {
        this.viewCount = viewCount;
        return this;
    }

    @JsonProperty("accept_rate")
    public Integer getAcceptRate() {
        return acceptRate;
    }

    @JsonProperty("accept_rate")
    public void setAcceptRate(Integer acceptRate) {
        this.acceptRate = acceptRate;
    }

    public User withAcceptRate(Integer acceptRate) {
        this.acceptRate = acceptRate;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
