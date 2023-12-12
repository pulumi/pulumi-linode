// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.linode.outputs.GetNodeBalancerConfigNodeStatus;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetNodeBalancerConfigResult {
    /**
     * @return What algorithm this NodeBalancer should use for routing traffic to backends (`roundrobin`, `leastconn`, `source`)
     * 
     */
    private String algorithm;
    /**
     * @return The type of check to perform against backends to ensure they are serving requests. This is used to determine if backends are up or down. If none no check is performed. connection requires only a connection to the backend to succeed. http and http_body rely on the backend serving HTTP, and that the response returned matches what is expected. (`none`, `connection`, `http`, `http_body`)
     * 
     */
    private String check;
    /**
     * @return How many times to attempt a check before considering a backend to be down. (1-30)
     * 
     */
    private Integer checkAttempts;
    private String checkBody;
    /**
     * @return How often, in seconds, to check that backends are up and serving requests.
     * 
     */
    private Integer checkInterval;
    /**
     * @return If true, any response from this backend with a 5xx status code will be enough for it to be considered unhealthy and taken out of rotation.
     * 
     */
    private Boolean checkPassive;
    /**
     * @return The URL path to check on each backend. If the backend does not respond to this request it is considered to be down.
     * 
     */
    private String checkPath;
    /**
     * @return How long, in seconds, to wait for a check attempt before considering it failed. (1-30)
     * 
     */
    private Integer checkTimeout;
    /**
     * @return What ciphers to use for SSL connections served by this NodeBalancer. `legacy` is considered insecure and should only be used if necessary. (`recommended`, `legacy`)
     * 
     */
    private String cipherSuite;
    private Integer id;
    private List<GetNodeBalancerConfigNodeStatus> nodeStatuses;
    private Integer nodebalancerId;
    /**
     * @return The TCP port this Config is for.
     * 
     */
    private Integer port;
    /**
     * @return The protocol this port is configured to serve. If this is set to https you must include an ssl_cert and an ssl_key. (`http`, `https`, `tcp`) (Defaults to `http`)
     * 
     */
    private String protocol;
    /**
     * @return The version of ProxyProtocol to use for the underlying NodeBalancer. This requires protocol to be `tcp`. (`none`, `v1`, and `v2`) (Defaults to `none`)
     * 
     */
    private String proxyProtocol;
    /**
     * @return The read-only common name automatically derived from the SSL certificate assigned to this NodeBalancerConfig. Please refer to this field to verify that the appropriate certificate is assigned to your NodeBalancerConfig.
     * 
     */
    private String sslCommonname;
    /**
     * @return The read-only fingerprint automatically derived from the SSL certificate assigned to this NodeBalancerConfig. Please refer to this field to verify that the appropriate certificate is assigned to your NodeBalancerConfig.
     * 
     */
    private String sslFingerprint;
    /**
     * @return Controls how session stickiness is handled on this port. (`none`, `table`, `http_cookie`)
     * 
     */
    private String stickiness;

    private GetNodeBalancerConfigResult() {}
    /**
     * @return What algorithm this NodeBalancer should use for routing traffic to backends (`roundrobin`, `leastconn`, `source`)
     * 
     */
    public String algorithm() {
        return this.algorithm;
    }
    /**
     * @return The type of check to perform against backends to ensure they are serving requests. This is used to determine if backends are up or down. If none no check is performed. connection requires only a connection to the backend to succeed. http and http_body rely on the backend serving HTTP, and that the response returned matches what is expected. (`none`, `connection`, `http`, `http_body`)
     * 
     */
    public String check() {
        return this.check;
    }
    /**
     * @return How many times to attempt a check before considering a backend to be down. (1-30)
     * 
     */
    public Integer checkAttempts() {
        return this.checkAttempts;
    }
    public String checkBody() {
        return this.checkBody;
    }
    /**
     * @return How often, in seconds, to check that backends are up and serving requests.
     * 
     */
    public Integer checkInterval() {
        return this.checkInterval;
    }
    /**
     * @return If true, any response from this backend with a 5xx status code will be enough for it to be considered unhealthy and taken out of rotation.
     * 
     */
    public Boolean checkPassive() {
        return this.checkPassive;
    }
    /**
     * @return The URL path to check on each backend. If the backend does not respond to this request it is considered to be down.
     * 
     */
    public String checkPath() {
        return this.checkPath;
    }
    /**
     * @return How long, in seconds, to wait for a check attempt before considering it failed. (1-30)
     * 
     */
    public Integer checkTimeout() {
        return this.checkTimeout;
    }
    /**
     * @return What ciphers to use for SSL connections served by this NodeBalancer. `legacy` is considered insecure and should only be used if necessary. (`recommended`, `legacy`)
     * 
     */
    public String cipherSuite() {
        return this.cipherSuite;
    }
    public Integer id() {
        return this.id;
    }
    public List<GetNodeBalancerConfigNodeStatus> nodeStatuses() {
        return this.nodeStatuses;
    }
    public Integer nodebalancerId() {
        return this.nodebalancerId;
    }
    /**
     * @return The TCP port this Config is for.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return The protocol this port is configured to serve. If this is set to https you must include an ssl_cert and an ssl_key. (`http`, `https`, `tcp`) (Defaults to `http`)
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    /**
     * @return The version of ProxyProtocol to use for the underlying NodeBalancer. This requires protocol to be `tcp`. (`none`, `v1`, and `v2`) (Defaults to `none`)
     * 
     */
    public String proxyProtocol() {
        return this.proxyProtocol;
    }
    /**
     * @return The read-only common name automatically derived from the SSL certificate assigned to this NodeBalancerConfig. Please refer to this field to verify that the appropriate certificate is assigned to your NodeBalancerConfig.
     * 
     */
    public String sslCommonname() {
        return this.sslCommonname;
    }
    /**
     * @return The read-only fingerprint automatically derived from the SSL certificate assigned to this NodeBalancerConfig. Please refer to this field to verify that the appropriate certificate is assigned to your NodeBalancerConfig.
     * 
     */
    public String sslFingerprint() {
        return this.sslFingerprint;
    }
    /**
     * @return Controls how session stickiness is handled on this port. (`none`, `table`, `http_cookie`)
     * 
     */
    public String stickiness() {
        return this.stickiness;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNodeBalancerConfigResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String algorithm;
        private String check;
        private Integer checkAttempts;
        private String checkBody;
        private Integer checkInterval;
        private Boolean checkPassive;
        private String checkPath;
        private Integer checkTimeout;
        private String cipherSuite;
        private Integer id;
        private List<GetNodeBalancerConfigNodeStatus> nodeStatuses;
        private Integer nodebalancerId;
        private Integer port;
        private String protocol;
        private String proxyProtocol;
        private String sslCommonname;
        private String sslFingerprint;
        private String stickiness;
        public Builder() {}
        public Builder(GetNodeBalancerConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.check = defaults.check;
    	      this.checkAttempts = defaults.checkAttempts;
    	      this.checkBody = defaults.checkBody;
    	      this.checkInterval = defaults.checkInterval;
    	      this.checkPassive = defaults.checkPassive;
    	      this.checkPath = defaults.checkPath;
    	      this.checkTimeout = defaults.checkTimeout;
    	      this.cipherSuite = defaults.cipherSuite;
    	      this.id = defaults.id;
    	      this.nodeStatuses = defaults.nodeStatuses;
    	      this.nodebalancerId = defaults.nodebalancerId;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.proxyProtocol = defaults.proxyProtocol;
    	      this.sslCommonname = defaults.sslCommonname;
    	      this.sslFingerprint = defaults.sslFingerprint;
    	      this.stickiness = defaults.stickiness;
        }

        @CustomType.Setter
        public Builder algorithm(String algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }
        @CustomType.Setter
        public Builder check(String check) {
            this.check = Objects.requireNonNull(check);
            return this;
        }
        @CustomType.Setter
        public Builder checkAttempts(Integer checkAttempts) {
            this.checkAttempts = Objects.requireNonNull(checkAttempts);
            return this;
        }
        @CustomType.Setter
        public Builder checkBody(String checkBody) {
            this.checkBody = Objects.requireNonNull(checkBody);
            return this;
        }
        @CustomType.Setter
        public Builder checkInterval(Integer checkInterval) {
            this.checkInterval = Objects.requireNonNull(checkInterval);
            return this;
        }
        @CustomType.Setter
        public Builder checkPassive(Boolean checkPassive) {
            this.checkPassive = Objects.requireNonNull(checkPassive);
            return this;
        }
        @CustomType.Setter
        public Builder checkPath(String checkPath) {
            this.checkPath = Objects.requireNonNull(checkPath);
            return this;
        }
        @CustomType.Setter
        public Builder checkTimeout(Integer checkTimeout) {
            this.checkTimeout = Objects.requireNonNull(checkTimeout);
            return this;
        }
        @CustomType.Setter
        public Builder cipherSuite(String cipherSuite) {
            this.cipherSuite = Objects.requireNonNull(cipherSuite);
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder nodeStatuses(List<GetNodeBalancerConfigNodeStatus> nodeStatuses) {
            this.nodeStatuses = Objects.requireNonNull(nodeStatuses);
            return this;
        }
        public Builder nodeStatuses(GetNodeBalancerConfigNodeStatus... nodeStatuses) {
            return nodeStatuses(List.of(nodeStatuses));
        }
        @CustomType.Setter
        public Builder nodebalancerId(Integer nodebalancerId) {
            this.nodebalancerId = Objects.requireNonNull(nodebalancerId);
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        @CustomType.Setter
        public Builder proxyProtocol(String proxyProtocol) {
            this.proxyProtocol = Objects.requireNonNull(proxyProtocol);
            return this;
        }
        @CustomType.Setter
        public Builder sslCommonname(String sslCommonname) {
            this.sslCommonname = Objects.requireNonNull(sslCommonname);
            return this;
        }
        @CustomType.Setter
        public Builder sslFingerprint(String sslFingerprint) {
            this.sslFingerprint = Objects.requireNonNull(sslFingerprint);
            return this;
        }
        @CustomType.Setter
        public Builder stickiness(String stickiness) {
            this.stickiness = Objects.requireNonNull(stickiness);
            return this;
        }
        public GetNodeBalancerConfigResult build() {
            final var _resultValue = new GetNodeBalancerConfigResult();
            _resultValue.algorithm = algorithm;
            _resultValue.check = check;
            _resultValue.checkAttempts = checkAttempts;
            _resultValue.checkBody = checkBody;
            _resultValue.checkInterval = checkInterval;
            _resultValue.checkPassive = checkPassive;
            _resultValue.checkPath = checkPath;
            _resultValue.checkTimeout = checkTimeout;
            _resultValue.cipherSuite = cipherSuite;
            _resultValue.id = id;
            _resultValue.nodeStatuses = nodeStatuses;
            _resultValue.nodebalancerId = nodebalancerId;
            _resultValue.port = port;
            _resultValue.protocol = protocol;
            _resultValue.proxyProtocol = proxyProtocol;
            _resultValue.sslCommonname = sslCommonname;
            _resultValue.sslFingerprint = sslFingerprint;
            _resultValue.stickiness = stickiness;
            return _resultValue;
        }
    }
}
