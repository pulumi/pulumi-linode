// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package linode

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

type NodeBalancerConfig struct {
	pulumi.CustomResourceState

	// What algorithm this NodeBalancer should use for routing traffic to backends: roundrobin, leastconn, source
	Algorithm pulumi.StringOutput `pulumi:"algorithm"`
	// The type of check to perform against backends to ensure they are serving requests. This is used to determine if backends are up or down. If none no check is performed. connection requires only a connection to the backend to succeed. http and httpBody rely on the backend serving HTTP, and that the response returned matches what is expected.
	Check pulumi.StringOutput `pulumi:"check"`
	// How many times to attempt a check before considering a backend to be down. (1-30)
	CheckAttempts pulumi.IntOutput `pulumi:"checkAttempts"`
	// This value must be present in the response body of the check in order for it to pass. If this value is not present in
	// the response body of a check request, the backend is considered to be down
	CheckBody pulumi.StringOutput `pulumi:"checkBody"`
	// How often, in seconds, to check that backends are up and serving requests.
	CheckInterval pulumi.IntOutput `pulumi:"checkInterval"`
	// If true, any response from this backend with a 5xx status code will be enough for it to be considered unhealthy and taken out of rotation.
	CheckPassive pulumi.BoolOutput `pulumi:"checkPassive"`
	// The URL path to check on each backend. If the backend does not respond to this request it is considered to be down.
	CheckPath pulumi.StringOutput `pulumi:"checkPath"`
	// How long, in seconds, to wait for a check attempt before considering it failed. (1-30)
	CheckTimeout pulumi.IntOutput `pulumi:"checkTimeout"`
	// What ciphers to use for SSL connections served by this NodeBalancer. `legacy` is considered insecure and should only be used if necessary.
	CipherSuite pulumi.StringOutput `pulumi:"cipherSuite"`
	NodeStatus NodeBalancerConfigNodeStatusOutput `pulumi:"nodeStatus"`
	// The ID of the NodeBalancer to access.
	NodebalancerId pulumi.IntOutput `pulumi:"nodebalancerId"`
	// The TCP port this Config is for. These values must be unique across configs on a single NodeBalancer (you can't have two configs for port 80, for example). While some ports imply some protocols, no enforcement is done and you may configure your NodeBalancer however is useful to you. For example, while port 443 is generally used for HTTPS, you do not need SSL configured to have a NodeBalancer listening on port 443. (Defaults to 80)
	Port pulumi.IntPtrOutput `pulumi:"port"`
	// The protocol this port is configured to serve. If this is set to https you must include an sslCert and an ssl_key. (Defaults to "http")
	Protocol pulumi.StringPtrOutput `pulumi:"protocol"`
	// The certificate this port is serving. This is not returned. If set, this field will come back as `<REDACTED>`. Please use the sslCommonname and sslFingerprint to identify the certificate.
	SslCert pulumi.StringPtrOutput `pulumi:"sslCert"`
	// The common name for the SSL certification this port is serving if this port is not configured to use SSL.
	SslCommonname pulumi.StringOutput `pulumi:"sslCommonname"`
	// The fingerprint for the SSL certification this port is serving if this port is not configured to use SSL.
	SslFingerprint pulumi.StringOutput `pulumi:"sslFingerprint"`
	// The private key corresponding to this port's certificate. This is not returned. If set, this field will come back as `<REDACTED>`. Please use the sslCommonname and sslFingerprint to identify the certificate.
	SslKey pulumi.StringPtrOutput `pulumi:"sslKey"`
	// Controls how session stickiness is handled on this port: 'none', 'table', 'http_cookie'
	Stickiness pulumi.StringOutput `pulumi:"stickiness"`
}

// NewNodeBalancerConfig registers a new resource with the given unique name, arguments, and options.
func NewNodeBalancerConfig(ctx *pulumi.Context,
	name string, args *NodeBalancerConfigArgs, opts ...pulumi.ResourceOption) (*NodeBalancerConfig, error) {
	if args == nil || args.NodebalancerId == nil {
		return nil, errors.New("missing required argument 'NodebalancerId'")
	}
	if args == nil {
		args = &NodeBalancerConfigArgs{}
	}
	var resource NodeBalancerConfig
	err := ctx.RegisterResource("linode:index/nodeBalancerConfig:NodeBalancerConfig", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNodeBalancerConfig gets an existing NodeBalancerConfig resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNodeBalancerConfig(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NodeBalancerConfigState, opts ...pulumi.ResourceOption) (*NodeBalancerConfig, error) {
	var resource NodeBalancerConfig
	err := ctx.ReadResource("linode:index/nodeBalancerConfig:NodeBalancerConfig", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NodeBalancerConfig resources.
type nodeBalancerConfigState struct {
	// What algorithm this NodeBalancer should use for routing traffic to backends: roundrobin, leastconn, source
	Algorithm *string `pulumi:"algorithm"`
	// The type of check to perform against backends to ensure they are serving requests. This is used to determine if backends are up or down. If none no check is performed. connection requires only a connection to the backend to succeed. http and httpBody rely on the backend serving HTTP, and that the response returned matches what is expected.
	Check *string `pulumi:"check"`
	// How many times to attempt a check before considering a backend to be down. (1-30)
	CheckAttempts *int `pulumi:"checkAttempts"`
	// This value must be present in the response body of the check in order for it to pass. If this value is not present in
	// the response body of a check request, the backend is considered to be down
	CheckBody *string `pulumi:"checkBody"`
	// How often, in seconds, to check that backends are up and serving requests.
	CheckInterval *int `pulumi:"checkInterval"`
	// If true, any response from this backend with a 5xx status code will be enough for it to be considered unhealthy and taken out of rotation.
	CheckPassive *bool `pulumi:"checkPassive"`
	// The URL path to check on each backend. If the backend does not respond to this request it is considered to be down.
	CheckPath *string `pulumi:"checkPath"`
	// How long, in seconds, to wait for a check attempt before considering it failed. (1-30)
	CheckTimeout *int `pulumi:"checkTimeout"`
	// What ciphers to use for SSL connections served by this NodeBalancer. `legacy` is considered insecure and should only be used if necessary.
	CipherSuite *string `pulumi:"cipherSuite"`
	NodeStatus *NodeBalancerConfigNodeStatus `pulumi:"nodeStatus"`
	// The ID of the NodeBalancer to access.
	NodebalancerId *int `pulumi:"nodebalancerId"`
	// The TCP port this Config is for. These values must be unique across configs on a single NodeBalancer (you can't have two configs for port 80, for example). While some ports imply some protocols, no enforcement is done and you may configure your NodeBalancer however is useful to you. For example, while port 443 is generally used for HTTPS, you do not need SSL configured to have a NodeBalancer listening on port 443. (Defaults to 80)
	Port *int `pulumi:"port"`
	// The protocol this port is configured to serve. If this is set to https you must include an sslCert and an ssl_key. (Defaults to "http")
	Protocol *string `pulumi:"protocol"`
	// The certificate this port is serving. This is not returned. If set, this field will come back as `<REDACTED>`. Please use the sslCommonname and sslFingerprint to identify the certificate.
	SslCert *string `pulumi:"sslCert"`
	// The common name for the SSL certification this port is serving if this port is not configured to use SSL.
	SslCommonname *string `pulumi:"sslCommonname"`
	// The fingerprint for the SSL certification this port is serving if this port is not configured to use SSL.
	SslFingerprint *string `pulumi:"sslFingerprint"`
	// The private key corresponding to this port's certificate. This is not returned. If set, this field will come back as `<REDACTED>`. Please use the sslCommonname and sslFingerprint to identify the certificate.
	SslKey *string `pulumi:"sslKey"`
	// Controls how session stickiness is handled on this port: 'none', 'table', 'http_cookie'
	Stickiness *string `pulumi:"stickiness"`
}

type NodeBalancerConfigState struct {
	// What algorithm this NodeBalancer should use for routing traffic to backends: roundrobin, leastconn, source
	Algorithm pulumi.StringPtrInput
	// The type of check to perform against backends to ensure they are serving requests. This is used to determine if backends are up or down. If none no check is performed. connection requires only a connection to the backend to succeed. http and httpBody rely on the backend serving HTTP, and that the response returned matches what is expected.
	Check pulumi.StringPtrInput
	// How many times to attempt a check before considering a backend to be down. (1-30)
	CheckAttempts pulumi.IntPtrInput
	// This value must be present in the response body of the check in order for it to pass. If this value is not present in
	// the response body of a check request, the backend is considered to be down
	CheckBody pulumi.StringPtrInput
	// How often, in seconds, to check that backends are up and serving requests.
	CheckInterval pulumi.IntPtrInput
	// If true, any response from this backend with a 5xx status code will be enough for it to be considered unhealthy and taken out of rotation.
	CheckPassive pulumi.BoolPtrInput
	// The URL path to check on each backend. If the backend does not respond to this request it is considered to be down.
	CheckPath pulumi.StringPtrInput
	// How long, in seconds, to wait for a check attempt before considering it failed. (1-30)
	CheckTimeout pulumi.IntPtrInput
	// What ciphers to use for SSL connections served by this NodeBalancer. `legacy` is considered insecure and should only be used if necessary.
	CipherSuite pulumi.StringPtrInput
	NodeStatus NodeBalancerConfigNodeStatusPtrInput
	// The ID of the NodeBalancer to access.
	NodebalancerId pulumi.IntPtrInput
	// The TCP port this Config is for. These values must be unique across configs on a single NodeBalancer (you can't have two configs for port 80, for example). While some ports imply some protocols, no enforcement is done and you may configure your NodeBalancer however is useful to you. For example, while port 443 is generally used for HTTPS, you do not need SSL configured to have a NodeBalancer listening on port 443. (Defaults to 80)
	Port pulumi.IntPtrInput
	// The protocol this port is configured to serve. If this is set to https you must include an sslCert and an ssl_key. (Defaults to "http")
	Protocol pulumi.StringPtrInput
	// The certificate this port is serving. This is not returned. If set, this field will come back as `<REDACTED>`. Please use the sslCommonname and sslFingerprint to identify the certificate.
	SslCert pulumi.StringPtrInput
	// The common name for the SSL certification this port is serving if this port is not configured to use SSL.
	SslCommonname pulumi.StringPtrInput
	// The fingerprint for the SSL certification this port is serving if this port is not configured to use SSL.
	SslFingerprint pulumi.StringPtrInput
	// The private key corresponding to this port's certificate. This is not returned. If set, this field will come back as `<REDACTED>`. Please use the sslCommonname and sslFingerprint to identify the certificate.
	SslKey pulumi.StringPtrInput
	// Controls how session stickiness is handled on this port: 'none', 'table', 'http_cookie'
	Stickiness pulumi.StringPtrInput
}

func (NodeBalancerConfigState) ElementType() reflect.Type {
	return reflect.TypeOf((*nodeBalancerConfigState)(nil)).Elem()
}

type nodeBalancerConfigArgs struct {
	// What algorithm this NodeBalancer should use for routing traffic to backends: roundrobin, leastconn, source
	Algorithm *string `pulumi:"algorithm"`
	// The type of check to perform against backends to ensure they are serving requests. This is used to determine if backends are up or down. If none no check is performed. connection requires only a connection to the backend to succeed. http and httpBody rely on the backend serving HTTP, and that the response returned matches what is expected.
	Check *string `pulumi:"check"`
	// How many times to attempt a check before considering a backend to be down. (1-30)
	CheckAttempts *int `pulumi:"checkAttempts"`
	// This value must be present in the response body of the check in order for it to pass. If this value is not present in
	// the response body of a check request, the backend is considered to be down
	CheckBody *string `pulumi:"checkBody"`
	// How often, in seconds, to check that backends are up and serving requests.
	CheckInterval *int `pulumi:"checkInterval"`
	// If true, any response from this backend with a 5xx status code will be enough for it to be considered unhealthy and taken out of rotation.
	CheckPassive *bool `pulumi:"checkPassive"`
	// The URL path to check on each backend. If the backend does not respond to this request it is considered to be down.
	CheckPath *string `pulumi:"checkPath"`
	// How long, in seconds, to wait for a check attempt before considering it failed. (1-30)
	CheckTimeout *int `pulumi:"checkTimeout"`
	// What ciphers to use for SSL connections served by this NodeBalancer. `legacy` is considered insecure and should only be used if necessary.
	CipherSuite *string `pulumi:"cipherSuite"`
	// The ID of the NodeBalancer to access.
	NodebalancerId int `pulumi:"nodebalancerId"`
	// The TCP port this Config is for. These values must be unique across configs on a single NodeBalancer (you can't have two configs for port 80, for example). While some ports imply some protocols, no enforcement is done and you may configure your NodeBalancer however is useful to you. For example, while port 443 is generally used for HTTPS, you do not need SSL configured to have a NodeBalancer listening on port 443. (Defaults to 80)
	Port *int `pulumi:"port"`
	// The protocol this port is configured to serve. If this is set to https you must include an sslCert and an ssl_key. (Defaults to "http")
	Protocol *string `pulumi:"protocol"`
	// The certificate this port is serving. This is not returned. If set, this field will come back as `<REDACTED>`. Please use the sslCommonname and sslFingerprint to identify the certificate.
	SslCert *string `pulumi:"sslCert"`
	// The private key corresponding to this port's certificate. This is not returned. If set, this field will come back as `<REDACTED>`. Please use the sslCommonname and sslFingerprint to identify the certificate.
	SslKey *string `pulumi:"sslKey"`
	// Controls how session stickiness is handled on this port: 'none', 'table', 'http_cookie'
	Stickiness *string `pulumi:"stickiness"`
}

// The set of arguments for constructing a NodeBalancerConfig resource.
type NodeBalancerConfigArgs struct {
	// What algorithm this NodeBalancer should use for routing traffic to backends: roundrobin, leastconn, source
	Algorithm pulumi.StringPtrInput
	// The type of check to perform against backends to ensure they are serving requests. This is used to determine if backends are up or down. If none no check is performed. connection requires only a connection to the backend to succeed. http and httpBody rely on the backend serving HTTP, and that the response returned matches what is expected.
	Check pulumi.StringPtrInput
	// How many times to attempt a check before considering a backend to be down. (1-30)
	CheckAttempts pulumi.IntPtrInput
	// This value must be present in the response body of the check in order for it to pass. If this value is not present in
	// the response body of a check request, the backend is considered to be down
	CheckBody pulumi.StringPtrInput
	// How often, in seconds, to check that backends are up and serving requests.
	CheckInterval pulumi.IntPtrInput
	// If true, any response from this backend with a 5xx status code will be enough for it to be considered unhealthy and taken out of rotation.
	CheckPassive pulumi.BoolPtrInput
	// The URL path to check on each backend. If the backend does not respond to this request it is considered to be down.
	CheckPath pulumi.StringPtrInput
	// How long, in seconds, to wait for a check attempt before considering it failed. (1-30)
	CheckTimeout pulumi.IntPtrInput
	// What ciphers to use for SSL connections served by this NodeBalancer. `legacy` is considered insecure and should only be used if necessary.
	CipherSuite pulumi.StringPtrInput
	// The ID of the NodeBalancer to access.
	NodebalancerId pulumi.IntInput
	// The TCP port this Config is for. These values must be unique across configs on a single NodeBalancer (you can't have two configs for port 80, for example). While some ports imply some protocols, no enforcement is done and you may configure your NodeBalancer however is useful to you. For example, while port 443 is generally used for HTTPS, you do not need SSL configured to have a NodeBalancer listening on port 443. (Defaults to 80)
	Port pulumi.IntPtrInput
	// The protocol this port is configured to serve. If this is set to https you must include an sslCert and an ssl_key. (Defaults to "http")
	Protocol pulumi.StringPtrInput
	// The certificate this port is serving. This is not returned. If set, this field will come back as `<REDACTED>`. Please use the sslCommonname and sslFingerprint to identify the certificate.
	SslCert pulumi.StringPtrInput
	// The private key corresponding to this port's certificate. This is not returned. If set, this field will come back as `<REDACTED>`. Please use the sslCommonname and sslFingerprint to identify the certificate.
	SslKey pulumi.StringPtrInput
	// Controls how session stickiness is handled on this port: 'none', 'table', 'http_cookie'
	Stickiness pulumi.StringPtrInput
}

func (NodeBalancerConfigArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*nodeBalancerConfigArgs)(nil)).Elem()
}

