// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainArgs Empty = new DomainArgs();

    /**
     * The list of IPs that may perform a zone transfer for this Domain. This is potentially dangerous, and should be set to an empty list unless you intend to use it.
     * 
     */
    @Import(name="axfrIps")
    private @Nullable Output<List<String>> axfrIps;

    /**
     * @return The list of IPs that may perform a zone transfer for this Domain. This is potentially dangerous, and should be set to an empty list unless you intend to use it.
     * 
     */
    public Optional<Output<List<String>>> axfrIps() {
        return Optional.ofNullable(this.axfrIps);
    }

    /**
     * A description for this Domain. This is for display purposes only.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description for this Domain. This is for display purposes only.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The domain this Domain represents. These must be unique in our system; you cannot have two Domains representing the same domain.
     * 
     */
    @Import(name="domain", required=true)
    private Output<String> domain;

    /**
     * @return The domain this Domain represents. These must be unique in our system; you cannot have two Domains representing the same domain.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }

    /**
     * The amount of time in seconds that may pass before this Domain is no longer authoritative. Valid values are 0, 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
     * 
     */
    @Import(name="expireSec")
    private @Nullable Output<Integer> expireSec;

    /**
     * @return The amount of time in seconds that may pass before this Domain is no longer authoritative. Valid values are 0, 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
     * 
     */
    public Optional<Output<Integer>> expireSec() {
        return Optional.ofNullable(this.expireSec);
    }

    /**
     * The group this Domain belongs to. This is for display purposes only.
     * 
     */
    @Import(name="group")
    private @Nullable Output<String> group;

    /**
     * @return The group this Domain belongs to. This is for display purposes only.
     * 
     */
    public Optional<Output<String>> group() {
        return Optional.ofNullable(this.group);
    }

    /**
     * The IP addresses representing the master DNS for this Domain.
     * 
     * ***
     * 
     */
    @Import(name="masterIps")
    private @Nullable Output<List<String>> masterIps;

    /**
     * @return The IP addresses representing the master DNS for this Domain.
     * 
     * ***
     * 
     */
    public Optional<Output<List<String>>> masterIps() {
        return Optional.ofNullable(this.masterIps);
    }

    /**
     * The amount of time in seconds before this Domain should be refreshed. Valid values are 0, 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
     * 
     */
    @Import(name="refreshSec")
    private @Nullable Output<Integer> refreshSec;

    /**
     * @return The amount of time in seconds before this Domain should be refreshed. Valid values are 0, 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
     * 
     */
    public Optional<Output<Integer>> refreshSec() {
        return Optional.ofNullable(this.refreshSec);
    }

    /**
     * The interval, in seconds, at which a failed refresh should be retried. Valid values are 0, 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
     * 
     */
    @Import(name="retrySec")
    private @Nullable Output<Integer> retrySec;

    /**
     * @return The interval, in seconds, at which a failed refresh should be retried. Valid values are 0, 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
     * 
     */
    public Optional<Output<Integer>> retrySec() {
        return Optional.ofNullable(this.retrySec);
    }

    /**
     * Start of Authority email address. This is required for master Domains.
     * 
     */
    @Import(name="soaEmail")
    private @Nullable Output<String> soaEmail;

    /**
     * @return Start of Authority email address. This is required for master Domains.
     * 
     */
    public Optional<Output<String>> soaEmail() {
        return Optional.ofNullable(this.soaEmail);
    }

    /**
     * Used to control whether this Domain is currently being rendered (defaults to &#34;active&#34;).
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Used to control whether this Domain is currently being rendered (defaults to &#34;active&#34;).
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * A list of tags applied to this object. Tags are for organizational purposes only.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return A list of tags applied to this object. Tags are for organizational purposes only.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * &#39;Time to Live&#39; - the amount of time in seconds that this Domain&#39;s records may be cached by resolvers or other domain servers. Valid values are 0, 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
     * 
     */
    @Import(name="ttlSec")
    private @Nullable Output<Integer> ttlSec;

    /**
     * @return &#39;Time to Live&#39; - the amount of time in seconds that this Domain&#39;s records may be cached by resolvers or other domain servers. Valid values are 0, 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
     * 
     */
    public Optional<Output<Integer>> ttlSec() {
        return Optional.ofNullable(this.ttlSec);
    }

    /**
     * If this Domain represents the authoritative source of information for the domain it describes, or if it is a read-only copy of a master (also called a slave).
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return If this Domain represents the authoritative source of information for the domain it describes, or if it is a read-only copy of a master (also called a slave).
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private DomainArgs() {}

    private DomainArgs(DomainArgs $) {
        this.axfrIps = $.axfrIps;
        this.description = $.description;
        this.domain = $.domain;
        this.expireSec = $.expireSec;
        this.group = $.group;
        this.masterIps = $.masterIps;
        this.refreshSec = $.refreshSec;
        this.retrySec = $.retrySec;
        this.soaEmail = $.soaEmail;
        this.status = $.status;
        this.tags = $.tags;
        this.ttlSec = $.ttlSec;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainArgs $;

        public Builder() {
            $ = new DomainArgs();
        }

        public Builder(DomainArgs defaults) {
            $ = new DomainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param axfrIps The list of IPs that may perform a zone transfer for this Domain. This is potentially dangerous, and should be set to an empty list unless you intend to use it.
         * 
         * @return builder
         * 
         */
        public Builder axfrIps(@Nullable Output<List<String>> axfrIps) {
            $.axfrIps = axfrIps;
            return this;
        }

        /**
         * @param axfrIps The list of IPs that may perform a zone transfer for this Domain. This is potentially dangerous, and should be set to an empty list unless you intend to use it.
         * 
         * @return builder
         * 
         */
        public Builder axfrIps(List<String> axfrIps) {
            return axfrIps(Output.of(axfrIps));
        }

        /**
         * @param axfrIps The list of IPs that may perform a zone transfer for this Domain. This is potentially dangerous, and should be set to an empty list unless you intend to use it.
         * 
         * @return builder
         * 
         */
        public Builder axfrIps(String... axfrIps) {
            return axfrIps(List.of(axfrIps));
        }

        /**
         * @param description A description for this Domain. This is for display purposes only.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description for this Domain. This is for display purposes only.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param domain The domain this Domain represents. These must be unique in our system; you cannot have two Domains representing the same domain.
         * 
         * @return builder
         * 
         */
        public Builder domain(Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain The domain this Domain represents. These must be unique in our system; you cannot have two Domains representing the same domain.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param expireSec The amount of time in seconds that may pass before this Domain is no longer authoritative. Valid values are 0, 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
         * 
         * @return builder
         * 
         */
        public Builder expireSec(@Nullable Output<Integer> expireSec) {
            $.expireSec = expireSec;
            return this;
        }

        /**
         * @param expireSec The amount of time in seconds that may pass before this Domain is no longer authoritative. Valid values are 0, 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
         * 
         * @return builder
         * 
         */
        public Builder expireSec(Integer expireSec) {
            return expireSec(Output.of(expireSec));
        }

        /**
         * @param group The group this Domain belongs to. This is for display purposes only.
         * 
         * @return builder
         * 
         */
        public Builder group(@Nullable Output<String> group) {
            $.group = group;
            return this;
        }

        /**
         * @param group The group this Domain belongs to. This is for display purposes only.
         * 
         * @return builder
         * 
         */
        public Builder group(String group) {
            return group(Output.of(group));
        }

        /**
         * @param masterIps The IP addresses representing the master DNS for this Domain.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder masterIps(@Nullable Output<List<String>> masterIps) {
            $.masterIps = masterIps;
            return this;
        }

        /**
         * @param masterIps The IP addresses representing the master DNS for this Domain.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder masterIps(List<String> masterIps) {
            return masterIps(Output.of(masterIps));
        }

        /**
         * @param masterIps The IP addresses representing the master DNS for this Domain.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder masterIps(String... masterIps) {
            return masterIps(List.of(masterIps));
        }

        /**
         * @param refreshSec The amount of time in seconds before this Domain should be refreshed. Valid values are 0, 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
         * 
         * @return builder
         * 
         */
        public Builder refreshSec(@Nullable Output<Integer> refreshSec) {
            $.refreshSec = refreshSec;
            return this;
        }

        /**
         * @param refreshSec The amount of time in seconds before this Domain should be refreshed. Valid values are 0, 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
         * 
         * @return builder
         * 
         */
        public Builder refreshSec(Integer refreshSec) {
            return refreshSec(Output.of(refreshSec));
        }

        /**
         * @param retrySec The interval, in seconds, at which a failed refresh should be retried. Valid values are 0, 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
         * 
         * @return builder
         * 
         */
        public Builder retrySec(@Nullable Output<Integer> retrySec) {
            $.retrySec = retrySec;
            return this;
        }

        /**
         * @param retrySec The interval, in seconds, at which a failed refresh should be retried. Valid values are 0, 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
         * 
         * @return builder
         * 
         */
        public Builder retrySec(Integer retrySec) {
            return retrySec(Output.of(retrySec));
        }

        /**
         * @param soaEmail Start of Authority email address. This is required for master Domains.
         * 
         * @return builder
         * 
         */
        public Builder soaEmail(@Nullable Output<String> soaEmail) {
            $.soaEmail = soaEmail;
            return this;
        }

        /**
         * @param soaEmail Start of Authority email address. This is required for master Domains.
         * 
         * @return builder
         * 
         */
        public Builder soaEmail(String soaEmail) {
            return soaEmail(Output.of(soaEmail));
        }

        /**
         * @param status Used to control whether this Domain is currently being rendered (defaults to &#34;active&#34;).
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Used to control whether this Domain is currently being rendered (defaults to &#34;active&#34;).
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tags A list of tags applied to this object. Tags are for organizational purposes only.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of tags applied to this object. Tags are for organizational purposes only.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A list of tags applied to this object. Tags are for organizational purposes only.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param ttlSec &#39;Time to Live&#39; - the amount of time in seconds that this Domain&#39;s records may be cached by resolvers or other domain servers. Valid values are 0, 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
         * 
         * @return builder
         * 
         */
        public Builder ttlSec(@Nullable Output<Integer> ttlSec) {
            $.ttlSec = ttlSec;
            return this;
        }

        /**
         * @param ttlSec &#39;Time to Live&#39; - the amount of time in seconds that this Domain&#39;s records may be cached by resolvers or other domain servers. Valid values are 0, 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
         * 
         * @return builder
         * 
         */
        public Builder ttlSec(Integer ttlSec) {
            return ttlSec(Output.of(ttlSec));
        }

        /**
         * @param type If this Domain represents the authoritative source of information for the domain it describes, or if it is a read-only copy of a master (also called a slave).
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type If this Domain represents the authoritative source of information for the domain it describes, or if it is a read-only copy of a master (also called a slave).
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public DomainArgs build() {
            $.domain = Objects.requireNonNull($.domain, "expected parameter 'domain' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
