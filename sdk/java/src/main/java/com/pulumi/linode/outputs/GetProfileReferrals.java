// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetProfileReferrals {
    private final String code;
    private final Integer completed;
    private final Double credit;
    private final Integer pending;
    private final Integer total;
    private final String url;

    @CustomType.Constructor
    private GetProfileReferrals(
        @CustomType.Parameter("code") String code,
        @CustomType.Parameter("completed") Integer completed,
        @CustomType.Parameter("credit") Double credit,
        @CustomType.Parameter("pending") Integer pending,
        @CustomType.Parameter("total") Integer total,
        @CustomType.Parameter("url") String url) {
        this.code = code;
        this.completed = completed;
        this.credit = credit;
        this.pending = pending;
        this.total = total;
        this.url = url;
    }

    public String code() {
        return this.code;
    }
    public Integer completed() {
        return this.completed;
    }
    public Double credit() {
        return this.credit;
    }
    public Integer pending() {
        return this.pending;
    }
    public Integer total() {
        return this.total;
    }
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProfileReferrals defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private Integer completed;
        private Double credit;
        private Integer pending;
        private Integer total;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProfileReferrals defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.completed = defaults.completed;
    	      this.credit = defaults.credit;
    	      this.pending = defaults.pending;
    	      this.total = defaults.total;
    	      this.url = defaults.url;
        }

        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }
        public Builder completed(Integer completed) {
            this.completed = Objects.requireNonNull(completed);
            return this;
        }
        public Builder credit(Double credit) {
            this.credit = Objects.requireNonNull(credit);
            return this;
        }
        public Builder pending(Integer pending) {
            this.pending = Objects.requireNonNull(pending);
            return this;
        }
        public Builder total(Integer total) {
            this.total = Objects.requireNonNull(total);
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public GetProfileReferrals build() {
            return new GetProfileReferrals(code, completed, credit, pending, total, url);
        }
    }
}
