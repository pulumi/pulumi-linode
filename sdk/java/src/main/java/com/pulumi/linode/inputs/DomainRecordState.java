// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainRecordState extends com.pulumi.resources.ResourceArgs {

    public static final DomainRecordState Empty = new DomainRecordState();

    /**
     * The ID of the Domain to access.  *Changing `domain_id` forces the creation of a new Linode Domain Record.*.
     * 
     */
    @Import(name="domainId")
    private @Nullable Output<Integer> domainId;

    /**
     * @return The ID of the Domain to access.  *Changing `domain_id` forces the creation of a new Linode Domain Record.*.
     * 
     */
    public Optional<Output<Integer>> domainId() {
        return Optional.ofNullable(this.domainId);
    }

    /**
     * The name of this Record. Setting this is invalid for `SRV` records as it is generated by the API. This field&#39;s actual usage depends on the type of record this represents. For A and AAAA records, this is the subdomain being associated with an IP address.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of this Record. Setting this is invalid for `SRV` records as it is generated by the API. This field&#39;s actual usage depends on the type of record this represents. For A and AAAA records, this is the subdomain being associated with an IP address.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The port this Record points to.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The port this Record points to.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * The priority of the target host. Lower values are preferred.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return The priority of the target host. Lower values are preferred.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * The protocol this Record&#39;s service communicates with. Only valid for SRV records.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return The protocol this Record&#39;s service communicates with. Only valid for SRV records.
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * The type of Record this is in the DNS system. For example, A records associate a domain name with an IPv4 address, and AAAA records associate a domain name with an IPv6 address. See all supported record types [here](https://techdocs.akamai.com/linode-api/reference/post-domain-record). *Changing `record_type` forces the creation of a new Linode Domain Record.*.
     * 
     */
    @Import(name="recordType")
    private @Nullable Output<String> recordType;

    /**
     * @return The type of Record this is in the DNS system. For example, A records associate a domain name with an IPv4 address, and AAAA records associate a domain name with an IPv6 address. See all supported record types [here](https://techdocs.akamai.com/linode-api/reference/post-domain-record). *Changing `record_type` forces the creation of a new Linode Domain Record.*.
     * 
     */
    public Optional<Output<String>> recordType() {
        return Optional.ofNullable(this.recordType);
    }

    /**
     * The service this Record identified. Only valid for SRV records.
     * 
     */
    @Import(name="service")
    private @Nullable Output<String> service;

    /**
     * @return The service this Record identified. Only valid for SRV records.
     * 
     */
    public Optional<Output<String>> service() {
        return Optional.ofNullable(this.service);
    }

    /**
     * The tag portion of a CAA record. It is invalid to set this on other record types.
     * 
     */
    @Import(name="tag")
    private @Nullable Output<String> tag;

    /**
     * @return The tag portion of a CAA record. It is invalid to set this on other record types.
     * 
     */
    public Optional<Output<String>> tag() {
        return Optional.ofNullable(this.tag);
    }

    /**
     * The target for this Record. This field&#39;s actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.
     * 
     * ***
     * 
     */
    @Import(name="target")
    private @Nullable Output<String> target;

    /**
     * @return The target for this Record. This field&#39;s actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.
     * 
     * ***
     * 
     */
    public Optional<Output<String>> target() {
        return Optional.ofNullable(this.target);
    }

    /**
     * &#39;Time to Live&#39; - the amount of time in seconds that this Domain&#39;s records may be cached by resolvers or other domain servers. Valid values are 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
     * 
     */
    @Import(name="ttlSec")
    private @Nullable Output<Integer> ttlSec;

    /**
     * @return &#39;Time to Live&#39; - the amount of time in seconds that this Domain&#39;s records may be cached by resolvers or other domain servers. Valid values are 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
     * 
     */
    public Optional<Output<Integer>> ttlSec() {
        return Optional.ofNullable(this.ttlSec);
    }

    /**
     * The relative weight of this Record. Higher values are preferred.
     * 
     */
    @Import(name="weight")
    private @Nullable Output<Integer> weight;

    /**
     * @return The relative weight of this Record. Higher values are preferred.
     * 
     */
    public Optional<Output<Integer>> weight() {
        return Optional.ofNullable(this.weight);
    }

    private DomainRecordState() {}

    private DomainRecordState(DomainRecordState $) {
        this.domainId = $.domainId;
        this.name = $.name;
        this.port = $.port;
        this.priority = $.priority;
        this.protocol = $.protocol;
        this.recordType = $.recordType;
        this.service = $.service;
        this.tag = $.tag;
        this.target = $.target;
        this.ttlSec = $.ttlSec;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainRecordState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainRecordState $;

        public Builder() {
            $ = new DomainRecordState();
        }

        public Builder(DomainRecordState defaults) {
            $ = new DomainRecordState(Objects.requireNonNull(defaults));
        }

        /**
         * @param domainId The ID of the Domain to access.  *Changing `domain_id` forces the creation of a new Linode Domain Record.*.
         * 
         * @return builder
         * 
         */
        public Builder domainId(@Nullable Output<Integer> domainId) {
            $.domainId = domainId;
            return this;
        }

        /**
         * @param domainId The ID of the Domain to access.  *Changing `domain_id` forces the creation of a new Linode Domain Record.*.
         * 
         * @return builder
         * 
         */
        public Builder domainId(Integer domainId) {
            return domainId(Output.of(domainId));
        }

        /**
         * @param name The name of this Record. Setting this is invalid for `SRV` records as it is generated by the API. This field&#39;s actual usage depends on the type of record this represents. For A and AAAA records, this is the subdomain being associated with an IP address.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of this Record. Setting this is invalid for `SRV` records as it is generated by the API. This field&#39;s actual usage depends on the type of record this represents. For A and AAAA records, this is the subdomain being associated with an IP address.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param port The port this Record points to.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port this Record points to.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param priority The priority of the target host. Lower values are preferred.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority The priority of the target host. Lower values are preferred.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param protocol The protocol this Record&#39;s service communicates with. Only valid for SRV records.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The protocol this Record&#39;s service communicates with. Only valid for SRV records.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param recordType The type of Record this is in the DNS system. For example, A records associate a domain name with an IPv4 address, and AAAA records associate a domain name with an IPv6 address. See all supported record types [here](https://techdocs.akamai.com/linode-api/reference/post-domain-record). *Changing `record_type` forces the creation of a new Linode Domain Record.*.
         * 
         * @return builder
         * 
         */
        public Builder recordType(@Nullable Output<String> recordType) {
            $.recordType = recordType;
            return this;
        }

        /**
         * @param recordType The type of Record this is in the DNS system. For example, A records associate a domain name with an IPv4 address, and AAAA records associate a domain name with an IPv6 address. See all supported record types [here](https://techdocs.akamai.com/linode-api/reference/post-domain-record). *Changing `record_type` forces the creation of a new Linode Domain Record.*.
         * 
         * @return builder
         * 
         */
        public Builder recordType(String recordType) {
            return recordType(Output.of(recordType));
        }

        /**
         * @param service The service this Record identified. Only valid for SRV records.
         * 
         * @return builder
         * 
         */
        public Builder service(@Nullable Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service The service this Record identified. Only valid for SRV records.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        /**
         * @param tag The tag portion of a CAA record. It is invalid to set this on other record types.
         * 
         * @return builder
         * 
         */
        public Builder tag(@Nullable Output<String> tag) {
            $.tag = tag;
            return this;
        }

        /**
         * @param tag The tag portion of a CAA record. It is invalid to set this on other record types.
         * 
         * @return builder
         * 
         */
        public Builder tag(String tag) {
            return tag(Output.of(tag));
        }

        /**
         * @param target The target for this Record. This field&#39;s actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder target(@Nullable Output<String> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target The target for this Record. This field&#39;s actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder target(String target) {
            return target(Output.of(target));
        }

        /**
         * @param ttlSec &#39;Time to Live&#39; - the amount of time in seconds that this Domain&#39;s records may be cached by resolvers or other domain servers. Valid values are 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
         * 
         * @return builder
         * 
         */
        public Builder ttlSec(@Nullable Output<Integer> ttlSec) {
            $.ttlSec = ttlSec;
            return this;
        }

        /**
         * @param ttlSec &#39;Time to Live&#39; - the amount of time in seconds that this Domain&#39;s records may be cached by resolvers or other domain servers. Valid values are 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
         * 
         * @return builder
         * 
         */
        public Builder ttlSec(Integer ttlSec) {
            return ttlSec(Output.of(ttlSec));
        }

        /**
         * @param weight The relative weight of this Record. Higher values are preferred.
         * 
         * @return builder
         * 
         */
        public Builder weight(@Nullable Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        /**
         * @param weight The relative weight of this Record. Higher values are preferred.
         * 
         * @return builder
         * 
         */
        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public DomainRecordState build() {
            return $;
        }
    }

}
