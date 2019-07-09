// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

type NodeBalancerConfig struct {
	s *pulumi.ResourceState
}

// NewNodeBalancerConfig registers a new resource with the given unique name, arguments, and options.
func NewNodeBalancerConfig(ctx *pulumi.Context,
	name string, args *NodeBalancerConfigArgs, opts ...pulumi.ResourceOpt) (*NodeBalancerConfig, error) {
	if args == nil || args.NodebalancerId == nil {
		return nil, errors.New("missing required argument 'NodebalancerId'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["algorithm"] = nil
		inputs["check"] = nil
		inputs["checkAttempts"] = nil
		inputs["checkBody"] = nil
		inputs["checkInterval"] = nil
		inputs["checkPassive"] = nil
		inputs["checkPath"] = nil
		inputs["checkTimeout"] = nil
		inputs["cipherSuite"] = nil
		inputs["nodebalancerId"] = nil
		inputs["port"] = nil
		inputs["protocol"] = nil
		inputs["sslCert"] = nil
		inputs["sslKey"] = nil
		inputs["stickiness"] = nil
	} else {
		inputs["algorithm"] = args.Algorithm
		inputs["check"] = args.Check
		inputs["checkAttempts"] = args.CheckAttempts
		inputs["checkBody"] = args.CheckBody
		inputs["checkInterval"] = args.CheckInterval
		inputs["checkPassive"] = args.CheckPassive
		inputs["checkPath"] = args.CheckPath
		inputs["checkTimeout"] = args.CheckTimeout
		inputs["cipherSuite"] = args.CipherSuite
		inputs["nodebalancerId"] = args.NodebalancerId
		inputs["port"] = args.Port
		inputs["protocol"] = args.Protocol
		inputs["sslCert"] = args.SslCert
		inputs["sslKey"] = args.SslKey
		inputs["stickiness"] = args.Stickiness
	}
	inputs["nodeStatus"] = nil
	inputs["sslCommonname"] = nil
	inputs["sslFingerprint"] = nil
	s, err := ctx.RegisterResource("linode:index/nodeBalancerConfig:NodeBalancerConfig", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &NodeBalancerConfig{s: s}, nil
}

// GetNodeBalancerConfig gets an existing NodeBalancerConfig resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNodeBalancerConfig(ctx *pulumi.Context,
	name string, id pulumi.ID, state *NodeBalancerConfigState, opts ...pulumi.ResourceOpt) (*NodeBalancerConfig, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["algorithm"] = state.Algorithm
		inputs["check"] = state.Check
		inputs["checkAttempts"] = state.CheckAttempts
		inputs["checkBody"] = state.CheckBody
		inputs["checkInterval"] = state.CheckInterval
		inputs["checkPassive"] = state.CheckPassive
		inputs["checkPath"] = state.CheckPath
		inputs["checkTimeout"] = state.CheckTimeout
		inputs["cipherSuite"] = state.CipherSuite
		inputs["nodeStatus"] = state.NodeStatus
		inputs["nodebalancerId"] = state.NodebalancerId
		inputs["port"] = state.Port
		inputs["protocol"] = state.Protocol
		inputs["sslCert"] = state.SslCert
		inputs["sslCommonname"] = state.SslCommonname
		inputs["sslFingerprint"] = state.SslFingerprint
		inputs["sslKey"] = state.SslKey
		inputs["stickiness"] = state.Stickiness
	}
	s, err := ctx.ReadResource("linode:index/nodeBalancerConfig:NodeBalancerConfig", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &NodeBalancerConfig{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *NodeBalancerConfig) URN() *pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *NodeBalancerConfig) ID() *pulumi.IDOutput {
	return r.s.ID()
}

// What algorithm this NodeBalancer should use for routing traffic to backends: roundrobin, leastconn, source
func (r *NodeBalancerConfig) Algorithm() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["algorithm"])
}

// The type of check to perform against backends to ensure they are serving requests. This is used to determine if backends are up or down. If none no check is performed. connection requires only a connection to the backend to succeed. http and http_body rely on the backend serving HTTP, and that the response returned matches what is expected.
func (r *NodeBalancerConfig) Check() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["check"])
}

// How many times to attempt a check before considering a backend to be down. (1-30)
func (r *NodeBalancerConfig) CheckAttempts() *pulumi.IntOutput {
	return (*pulumi.IntOutput)(r.s.State["checkAttempts"])
}

// This value must be present in the response body of the check in order for it to pass. If this value is not present in
// the response body of a check request, the backend is considered to be down
func (r *NodeBalancerConfig) CheckBody() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["checkBody"])
}

// How often, in seconds, to check that backends are up and serving requests.
func (r *NodeBalancerConfig) CheckInterval() *pulumi.IntOutput {
	return (*pulumi.IntOutput)(r.s.State["checkInterval"])
}

// If true, any response from this backend with a 5xx status code will be enough for it to be considered unhealthy and taken out of rotation.
func (r *NodeBalancerConfig) CheckPassive() *pulumi.BoolOutput {
	return (*pulumi.BoolOutput)(r.s.State["checkPassive"])
}

// The URL path to check on each backend. If the backend does not respond to this request it is considered to be down.
func (r *NodeBalancerConfig) CheckPath() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["checkPath"])
}

// How long, in seconds, to wait for a check attempt before considering it failed. (1-30)
func (r *NodeBalancerConfig) CheckTimeout() *pulumi.IntOutput {
	return (*pulumi.IntOutput)(r.s.State["checkTimeout"])
}

// What ciphers to use for SSL connections served by this NodeBalancer. `legacy` is considered insecure and should only be used if necessary.
func (r *NodeBalancerConfig) CipherSuite() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["cipherSuite"])
}

func (r *NodeBalancerConfig) NodeStatus() *pulumi.Output {
	return r.s.State["nodeStatus"]
}

// The ID of the NodeBalancer to access.
func (r *NodeBalancerConfig) NodebalancerId() *pulumi.IntOutput {
	return (*pulumi.IntOutput)(r.s.State["nodebalancerId"])
}

// The TCP port this Config is for. These values must be unique across configs on a single NodeBalancer (you can't have two configs for port 80, for example). While some ports imply some protocols, no enforcement is done and you may configure your NodeBalancer however is useful to you. For example, while port 443 is generally used for HTTPS, you do not need SSL configured to have a NodeBalancer listening on port 443. (Defaults to 80)
func (r *NodeBalancerConfig) Port() *pulumi.IntOutput {
	return (*pulumi.IntOutput)(r.s.State["port"])
}

// The protocol this port is configured to serve. If this is set to https you must include an ssl_cert and an ssl_key. (Defaults to "http")
func (r *NodeBalancerConfig) Protocol() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["protocol"])
}

// The certificate this port is serving. This is not returned. If set, this field will come back as `<REDACTED>`. Please use the ssl_commonname and ssl_fingerprint to identify the certificate.
func (r *NodeBalancerConfig) SslCert() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["sslCert"])
}

// The common name for the SSL certification this port is serving if this port is not configured to use SSL.
func (r *NodeBalancerConfig) SslCommonname() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["sslCommonname"])
}

// The fingerprint for the SSL certification this port is serving if this port is not configured to use SSL.
func (r *NodeBalancerConfig) SslFingerprint() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["sslFingerprint"])
}

// The private key corresponding to this port's certificate. This is not returned. If set, this field will come back as `<REDACTED>`. Please use the ssl_commonname and ssl_fingerprint to identify the certificate.
func (r *NodeBalancerConfig) SslKey() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["sslKey"])
}

// Controls how session stickiness is handled on this port: 'none', 'table', 'http_cookie'
func (r *NodeBalancerConfig) Stickiness() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["stickiness"])
}

// Input properties used for looking up and filtering NodeBalancerConfig resources.
type NodeBalancerConfigState struct {
	// What algorithm this NodeBalancer should use for routing traffic to backends: roundrobin, leastconn, source
	Algorithm interface{}
	// The type of check to perform against backends to ensure they are serving requests. This is used to determine if backends are up or down. If none no check is performed. connection requires only a connection to the backend to succeed. http and http_body rely on the backend serving HTTP, and that the response returned matches what is expected.
	Check interface{}
	// How many times to attempt a check before considering a backend to be down. (1-30)
	CheckAttempts interface{}
	// This value must be present in the response body of the check in order for it to pass. If this value is not present in
	// the response body of a check request, the backend is considered to be down
	CheckBody interface{}
	// How often, in seconds, to check that backends are up and serving requests.
	CheckInterval interface{}
	// If true, any response from this backend with a 5xx status code will be enough for it to be considered unhealthy and taken out of rotation.
	CheckPassive interface{}
	// The URL path to check on each backend. If the backend does not respond to this request it is considered to be down.
	CheckPath interface{}
	// How long, in seconds, to wait for a check attempt before considering it failed. (1-30)
	CheckTimeout interface{}
	// What ciphers to use for SSL connections served by this NodeBalancer. `legacy` is considered insecure and should only be used if necessary.
	CipherSuite interface{}
	NodeStatus interface{}
	// The ID of the NodeBalancer to access.
	NodebalancerId interface{}
	// The TCP port this Config is for. These values must be unique across configs on a single NodeBalancer (you can't have two configs for port 80, for example). While some ports imply some protocols, no enforcement is done and you may configure your NodeBalancer however is useful to you. For example, while port 443 is generally used for HTTPS, you do not need SSL configured to have a NodeBalancer listening on port 443. (Defaults to 80)
	Port interface{}
	// The protocol this port is configured to serve. If this is set to https you must include an ssl_cert and an ssl_key. (Defaults to "http")
	Protocol interface{}
	// The certificate this port is serving. This is not returned. If set, this field will come back as `<REDACTED>`. Please use the ssl_commonname and ssl_fingerprint to identify the certificate.
	SslCert interface{}
	// The common name for the SSL certification this port is serving if this port is not configured to use SSL.
	SslCommonname interface{}
	// The fingerprint for the SSL certification this port is serving if this port is not configured to use SSL.
	SslFingerprint interface{}
	// The private key corresponding to this port's certificate. This is not returned. If set, this field will come back as `<REDACTED>`. Please use the ssl_commonname and ssl_fingerprint to identify the certificate.
	SslKey interface{}
	// Controls how session stickiness is handled on this port: 'none', 'table', 'http_cookie'
	Stickiness interface{}
}

// The set of arguments for constructing a NodeBalancerConfig resource.
type NodeBalancerConfigArgs struct {
	// What algorithm this NodeBalancer should use for routing traffic to backends: roundrobin, leastconn, source
	Algorithm interface{}
	// The type of check to perform against backends to ensure they are serving requests. This is used to determine if backends are up or down. If none no check is performed. connection requires only a connection to the backend to succeed. http and http_body rely on the backend serving HTTP, and that the response returned matches what is expected.
	Check interface{}
	// How many times to attempt a check before considering a backend to be down. (1-30)
	CheckAttempts interface{}
	// This value must be present in the response body of the check in order for it to pass. If this value is not present in
	// the response body of a check request, the backend is considered to be down
	CheckBody interface{}
	// How often, in seconds, to check that backends are up and serving requests.
	CheckInterval interface{}
	// If true, any response from this backend with a 5xx status code will be enough for it to be considered unhealthy and taken out of rotation.
	CheckPassive interface{}
	// The URL path to check on each backend. If the backend does not respond to this request it is considered to be down.
	CheckPath interface{}
	// How long, in seconds, to wait for a check attempt before considering it failed. (1-30)
	CheckTimeout interface{}
	// What ciphers to use for SSL connections served by this NodeBalancer. `legacy` is considered insecure and should only be used if necessary.
	CipherSuite interface{}
	// The ID of the NodeBalancer to access.
	NodebalancerId interface{}
	// The TCP port this Config is for. These values must be unique across configs on a single NodeBalancer (you can't have two configs for port 80, for example). While some ports imply some protocols, no enforcement is done and you may configure your NodeBalancer however is useful to you. For example, while port 443 is generally used for HTTPS, you do not need SSL configured to have a NodeBalancer listening on port 443. (Defaults to 80)
	Port interface{}
	// The protocol this port is configured to serve. If this is set to https you must include an ssl_cert and an ssl_key. (Defaults to "http")
	Protocol interface{}
	// The certificate this port is serving. This is not returned. If set, this field will come back as `<REDACTED>`. Please use the ssl_commonname and ssl_fingerprint to identify the certificate.
	SslCert interface{}
	// The private key corresponding to this port's certificate. This is not returned. If set, this field will come back as `<REDACTED>`. Please use the ssl_commonname and ssl_fingerprint to identify the certificate.
	SslKey interface{}
	// Controls how session stickiness is handled on this port: 'none', 'table', 'http_cookie'
	Stickiness interface{}
}
