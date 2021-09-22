// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Linode NodeBalancer Config resource.  This can be used to create, modify, and delete Linodes NodeBalancer Configs.
// For more information, see [Getting Started with NodeBalancers](https://www.linode.com/docs/platform/nodebalancer/getting-started-with-nodebalancers/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createNodeBalancerConfig).
//
// ## Example Usage
//
// The following example shows how one might use this resource to configure a NodeBalancer Config attached to a Linode instance.
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-linode/sdk/v3/go/linode"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		foobar, err := linode.NewNodeBalancer(ctx, "foobar", &linode.NodeBalancerArgs{
// 			Label:              pulumi.String("mynodebalancer"),
// 			Region:             pulumi.String("us-east"),
// 			ClientConnThrottle: pulumi.Int(20),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = linode.NewNodeBalancerConfig(ctx, "foofig", &linode.NodeBalancerConfigArgs{
// 			NodebalancerId: foobar.ID(),
// 			Port:           pulumi.Int(8088),
// 			Protocol:       pulumi.String("http"),
// 			Check:          pulumi.String("http"),
// 			CheckPath:      pulumi.String("/foo"),
// 			CheckAttempts:  pulumi.Int(3),
// 			CheckTimeout:   pulumi.Int(30),
// 			Stickiness:     pulumi.String("http_cookie"),
// 			Algorithm:      pulumi.String("source"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ## Attributes
//
// This resource exports the following attributes:
//
// * `sslCommonname` - The read-only common name automatically derived from the SSL certificate assigned to this NodeBalancerConfig. Please refer to this field to verify that the appropriate certificate is assigned to your NodeBalancerConfig.
//
// * `sslFingerprint` - The read-only fingerprint automatically derived from the SSL certificate assigned to this NodeBalancerConfig. Please refer to this field to verify that the appropriate certificate is assigned to your NodeBalancerConfig.
//
// * `nodeStatus` - The status of the attached nodes.
//
// ### nodeStatus
//
// The following attributes are available on node_status:
//
// * `up` - The number of backends considered to be 'UP' and healthy, and that are serving requests.
//
// * `down` - The number of backends considered to be 'DOWN' and unhealthy. These are not in rotation, and not serving requests.
//
// ## Import
//
// NodeBalancer Configs can be imported using the NodeBalancer `nodebalancer_id` followed by the NodeBalancer Config `id` separated by a comma, e.g.
//
// ```sh
//  $ pulumi import linode:index/nodeBalancerConfig:NodeBalancerConfig http-foobar 1234567,7654321
// ```
//
//  The Linode Guide, [Import Existing Infrastructure to Terraform](https://www.linode.com/docs/applications/configuration-management/import-existing-infrastructure-to-terraform/), offers resource importing examples for NodeBalancer Configs and other Linode resource types.
type NodeBalancerConfig struct {
	pulumi.CustomResourceState

	// What algorithm this NodeBalancer should use for routing traffic to backends. (`roundrobin`, `leastconn`, `source`)
	Algorithm pulumi.StringOutput `pulumi:"algorithm"`
	// The type of check to perform against backends to ensure they are serving requests. This is used to determine if backends are up or down. If none no check is performed. connection requires only a connection to the backend to succeed. http and httpBody rely on the backend serving HTTP, and that the response returned matches what is expected. (`none`, `connection`, `http`, `httpBody`)
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
	// A structure containing information about the health of the backends for this port. This information is updated
	// periodically as checks are performed against backends.
	NodeStatuses NodeBalancerConfigNodeStatusArrayOutput `pulumi:"nodeStatuses"`
	// The ID of the NodeBalancer to access.
	NodebalancerId pulumi.IntOutput `pulumi:"nodebalancerId"`
	// The TCP port this Config is for. These values must be unique across configs on a single NodeBalancer (you can't have two configs for port 80, for example). While some ports imply some protocols, no enforcement is done and you may configure your NodeBalancer however is useful to you. For example, while port 443 is generally used for HTTPS, you do not need SSL configured to have a NodeBalancer listening on port 443. (Defaults to 80)
	Port pulumi.IntPtrOutput `pulumi:"port"`
	// The protocol this port is configured to serve. If this is set to https you must include an sslCert and an ssl_key. (`http`, `https`, `tcp`) (Defaults to `http`)
	Protocol pulumi.StringPtrOutput `pulumi:"protocol"`
	// The version of ProxyProtocol to use for the underlying NodeBalancer. This requires protocol to be `tcp`. (`none`, `v1`, `v2`) (Defaults to `none`)
	ProxyProtocol pulumi.StringPtrOutput `pulumi:"proxyProtocol"`
	// The certificate this port is serving. This is not returned. If set, this field will come back as `<REDACTED>`. Please use the sslCommonname and sslFingerprint to identify the certificate.
	SslCert pulumi.StringPtrOutput `pulumi:"sslCert"`
	// The read-only common name automatically derived from the SSL certificate assigned to this NodeBalancerConfig. Please
	// refer to this field to verify that the appropriate certificate is assigned to your NodeBalancerConfig.
	SslCommonname pulumi.StringOutput `pulumi:"sslCommonname"`
	// The read-only fingerprint automatically derived from the SSL certificate assigned to this NodeBalancerConfig. Please
	// refer to this field to verify that the appropriate certificate is assigned to your NodeBalancerConfig.
	SslFingerprint pulumi.StringOutput `pulumi:"sslFingerprint"`
	// The private key corresponding to this port's certificate. This is not returned. If set, this field will come back as `<REDACTED>`. Please use the sslCommonname and sslFingerprint to identify the certificate.
	SslKey pulumi.StringPtrOutput `pulumi:"sslKey"`
	// Controls how session stickiness is handled on this port. (`none`, `table`, `httpCookie`)
	Stickiness pulumi.StringOutput `pulumi:"stickiness"`
}

// NewNodeBalancerConfig registers a new resource with the given unique name, arguments, and options.
func NewNodeBalancerConfig(ctx *pulumi.Context,
	name string, args *NodeBalancerConfigArgs, opts ...pulumi.ResourceOption) (*NodeBalancerConfig, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NodebalancerId == nil {
		return nil, errors.New("invalid value for required argument 'NodebalancerId'")
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
	// What algorithm this NodeBalancer should use for routing traffic to backends. (`roundrobin`, `leastconn`, `source`)
	Algorithm *string `pulumi:"algorithm"`
	// The type of check to perform against backends to ensure they are serving requests. This is used to determine if backends are up or down. If none no check is performed. connection requires only a connection to the backend to succeed. http and httpBody rely on the backend serving HTTP, and that the response returned matches what is expected. (`none`, `connection`, `http`, `httpBody`)
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
	// A structure containing information about the health of the backends for this port. This information is updated
	// periodically as checks are performed against backends.
	NodeStatuses []NodeBalancerConfigNodeStatus `pulumi:"nodeStatuses"`
	// The ID of the NodeBalancer to access.
	NodebalancerId *int `pulumi:"nodebalancerId"`
	// The TCP port this Config is for. These values must be unique across configs on a single NodeBalancer (you can't have two configs for port 80, for example). While some ports imply some protocols, no enforcement is done and you may configure your NodeBalancer however is useful to you. For example, while port 443 is generally used for HTTPS, you do not need SSL configured to have a NodeBalancer listening on port 443. (Defaults to 80)
	Port *int `pulumi:"port"`
	// The protocol this port is configured to serve. If this is set to https you must include an sslCert and an ssl_key. (`http`, `https`, `tcp`) (Defaults to `http`)
	Protocol *string `pulumi:"protocol"`
	// The version of ProxyProtocol to use for the underlying NodeBalancer. This requires protocol to be `tcp`. (`none`, `v1`, `v2`) (Defaults to `none`)
	ProxyProtocol *string `pulumi:"proxyProtocol"`
	// The certificate this port is serving. This is not returned. If set, this field will come back as `<REDACTED>`. Please use the sslCommonname and sslFingerprint to identify the certificate.
	SslCert *string `pulumi:"sslCert"`
	// The read-only common name automatically derived from the SSL certificate assigned to this NodeBalancerConfig. Please
	// refer to this field to verify that the appropriate certificate is assigned to your NodeBalancerConfig.
	SslCommonname *string `pulumi:"sslCommonname"`
	// The read-only fingerprint automatically derived from the SSL certificate assigned to this NodeBalancerConfig. Please
	// refer to this field to verify that the appropriate certificate is assigned to your NodeBalancerConfig.
	SslFingerprint *string `pulumi:"sslFingerprint"`
	// The private key corresponding to this port's certificate. This is not returned. If set, this field will come back as `<REDACTED>`. Please use the sslCommonname and sslFingerprint to identify the certificate.
	SslKey *string `pulumi:"sslKey"`
	// Controls how session stickiness is handled on this port. (`none`, `table`, `httpCookie`)
	Stickiness *string `pulumi:"stickiness"`
}

type NodeBalancerConfigState struct {
	// What algorithm this NodeBalancer should use for routing traffic to backends. (`roundrobin`, `leastconn`, `source`)
	Algorithm pulumi.StringPtrInput
	// The type of check to perform against backends to ensure they are serving requests. This is used to determine if backends are up or down. If none no check is performed. connection requires only a connection to the backend to succeed. http and httpBody rely on the backend serving HTTP, and that the response returned matches what is expected. (`none`, `connection`, `http`, `httpBody`)
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
	// A structure containing information about the health of the backends for this port. This information is updated
	// periodically as checks are performed against backends.
	NodeStatuses NodeBalancerConfigNodeStatusArrayInput
	// The ID of the NodeBalancer to access.
	NodebalancerId pulumi.IntPtrInput
	// The TCP port this Config is for. These values must be unique across configs on a single NodeBalancer (you can't have two configs for port 80, for example). While some ports imply some protocols, no enforcement is done and you may configure your NodeBalancer however is useful to you. For example, while port 443 is generally used for HTTPS, you do not need SSL configured to have a NodeBalancer listening on port 443. (Defaults to 80)
	Port pulumi.IntPtrInput
	// The protocol this port is configured to serve. If this is set to https you must include an sslCert and an ssl_key. (`http`, `https`, `tcp`) (Defaults to `http`)
	Protocol pulumi.StringPtrInput
	// The version of ProxyProtocol to use for the underlying NodeBalancer. This requires protocol to be `tcp`. (`none`, `v1`, `v2`) (Defaults to `none`)
	ProxyProtocol pulumi.StringPtrInput
	// The certificate this port is serving. This is not returned. If set, this field will come back as `<REDACTED>`. Please use the sslCommonname and sslFingerprint to identify the certificate.
	SslCert pulumi.StringPtrInput
	// The read-only common name automatically derived from the SSL certificate assigned to this NodeBalancerConfig. Please
	// refer to this field to verify that the appropriate certificate is assigned to your NodeBalancerConfig.
	SslCommonname pulumi.StringPtrInput
	// The read-only fingerprint automatically derived from the SSL certificate assigned to this NodeBalancerConfig. Please
	// refer to this field to verify that the appropriate certificate is assigned to your NodeBalancerConfig.
	SslFingerprint pulumi.StringPtrInput
	// The private key corresponding to this port's certificate. This is not returned. If set, this field will come back as `<REDACTED>`. Please use the sslCommonname and sslFingerprint to identify the certificate.
	SslKey pulumi.StringPtrInput
	// Controls how session stickiness is handled on this port. (`none`, `table`, `httpCookie`)
	Stickiness pulumi.StringPtrInput
}

func (NodeBalancerConfigState) ElementType() reflect.Type {
	return reflect.TypeOf((*nodeBalancerConfigState)(nil)).Elem()
}

type nodeBalancerConfigArgs struct {
	// What algorithm this NodeBalancer should use for routing traffic to backends. (`roundrobin`, `leastconn`, `source`)
	Algorithm *string `pulumi:"algorithm"`
	// The type of check to perform against backends to ensure they are serving requests. This is used to determine if backends are up or down. If none no check is performed. connection requires only a connection to the backend to succeed. http and httpBody rely on the backend serving HTTP, and that the response returned matches what is expected. (`none`, `connection`, `http`, `httpBody`)
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
	// The protocol this port is configured to serve. If this is set to https you must include an sslCert and an ssl_key. (`http`, `https`, `tcp`) (Defaults to `http`)
	Protocol *string `pulumi:"protocol"`
	// The version of ProxyProtocol to use for the underlying NodeBalancer. This requires protocol to be `tcp`. (`none`, `v1`, `v2`) (Defaults to `none`)
	ProxyProtocol *string `pulumi:"proxyProtocol"`
	// The certificate this port is serving. This is not returned. If set, this field will come back as `<REDACTED>`. Please use the sslCommonname and sslFingerprint to identify the certificate.
	SslCert *string `pulumi:"sslCert"`
	// The private key corresponding to this port's certificate. This is not returned. If set, this field will come back as `<REDACTED>`. Please use the sslCommonname and sslFingerprint to identify the certificate.
	SslKey *string `pulumi:"sslKey"`
	// Controls how session stickiness is handled on this port. (`none`, `table`, `httpCookie`)
	Stickiness *string `pulumi:"stickiness"`
}

// The set of arguments for constructing a NodeBalancerConfig resource.
type NodeBalancerConfigArgs struct {
	// What algorithm this NodeBalancer should use for routing traffic to backends. (`roundrobin`, `leastconn`, `source`)
	Algorithm pulumi.StringPtrInput
	// The type of check to perform against backends to ensure they are serving requests. This is used to determine if backends are up or down. If none no check is performed. connection requires only a connection to the backend to succeed. http and httpBody rely on the backend serving HTTP, and that the response returned matches what is expected. (`none`, `connection`, `http`, `httpBody`)
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
	// The protocol this port is configured to serve. If this is set to https you must include an sslCert and an ssl_key. (`http`, `https`, `tcp`) (Defaults to `http`)
	Protocol pulumi.StringPtrInput
	// The version of ProxyProtocol to use for the underlying NodeBalancer. This requires protocol to be `tcp`. (`none`, `v1`, `v2`) (Defaults to `none`)
	ProxyProtocol pulumi.StringPtrInput
	// The certificate this port is serving. This is not returned. If set, this field will come back as `<REDACTED>`. Please use the sslCommonname and sslFingerprint to identify the certificate.
	SslCert pulumi.StringPtrInput
	// The private key corresponding to this port's certificate. This is not returned. If set, this field will come back as `<REDACTED>`. Please use the sslCommonname and sslFingerprint to identify the certificate.
	SslKey pulumi.StringPtrInput
	// Controls how session stickiness is handled on this port. (`none`, `table`, `httpCookie`)
	Stickiness pulumi.StringPtrInput
}

func (NodeBalancerConfigArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*nodeBalancerConfigArgs)(nil)).Elem()
}

type NodeBalancerConfigInput interface {
	pulumi.Input

	ToNodeBalancerConfigOutput() NodeBalancerConfigOutput
	ToNodeBalancerConfigOutputWithContext(ctx context.Context) NodeBalancerConfigOutput
}

func (*NodeBalancerConfig) ElementType() reflect.Type {
	return reflect.TypeOf((*NodeBalancerConfig)(nil))
}

func (i *NodeBalancerConfig) ToNodeBalancerConfigOutput() NodeBalancerConfigOutput {
	return i.ToNodeBalancerConfigOutputWithContext(context.Background())
}

func (i *NodeBalancerConfig) ToNodeBalancerConfigOutputWithContext(ctx context.Context) NodeBalancerConfigOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NodeBalancerConfigOutput)
}

func (i *NodeBalancerConfig) ToNodeBalancerConfigPtrOutput() NodeBalancerConfigPtrOutput {
	return i.ToNodeBalancerConfigPtrOutputWithContext(context.Background())
}

func (i *NodeBalancerConfig) ToNodeBalancerConfigPtrOutputWithContext(ctx context.Context) NodeBalancerConfigPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NodeBalancerConfigPtrOutput)
}

type NodeBalancerConfigPtrInput interface {
	pulumi.Input

	ToNodeBalancerConfigPtrOutput() NodeBalancerConfigPtrOutput
	ToNodeBalancerConfigPtrOutputWithContext(ctx context.Context) NodeBalancerConfigPtrOutput
}

type nodeBalancerConfigPtrType NodeBalancerConfigArgs

func (*nodeBalancerConfigPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**NodeBalancerConfig)(nil))
}

func (i *nodeBalancerConfigPtrType) ToNodeBalancerConfigPtrOutput() NodeBalancerConfigPtrOutput {
	return i.ToNodeBalancerConfigPtrOutputWithContext(context.Background())
}

func (i *nodeBalancerConfigPtrType) ToNodeBalancerConfigPtrOutputWithContext(ctx context.Context) NodeBalancerConfigPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NodeBalancerConfigPtrOutput)
}

// NodeBalancerConfigArrayInput is an input type that accepts NodeBalancerConfigArray and NodeBalancerConfigArrayOutput values.
// You can construct a concrete instance of `NodeBalancerConfigArrayInput` via:
//
//          NodeBalancerConfigArray{ NodeBalancerConfigArgs{...} }
type NodeBalancerConfigArrayInput interface {
	pulumi.Input

	ToNodeBalancerConfigArrayOutput() NodeBalancerConfigArrayOutput
	ToNodeBalancerConfigArrayOutputWithContext(context.Context) NodeBalancerConfigArrayOutput
}

type NodeBalancerConfigArray []NodeBalancerConfigInput

func (NodeBalancerConfigArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NodeBalancerConfig)(nil)).Elem()
}

func (i NodeBalancerConfigArray) ToNodeBalancerConfigArrayOutput() NodeBalancerConfigArrayOutput {
	return i.ToNodeBalancerConfigArrayOutputWithContext(context.Background())
}

func (i NodeBalancerConfigArray) ToNodeBalancerConfigArrayOutputWithContext(ctx context.Context) NodeBalancerConfigArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NodeBalancerConfigArrayOutput)
}

// NodeBalancerConfigMapInput is an input type that accepts NodeBalancerConfigMap and NodeBalancerConfigMapOutput values.
// You can construct a concrete instance of `NodeBalancerConfigMapInput` via:
//
//          NodeBalancerConfigMap{ "key": NodeBalancerConfigArgs{...} }
type NodeBalancerConfigMapInput interface {
	pulumi.Input

	ToNodeBalancerConfigMapOutput() NodeBalancerConfigMapOutput
	ToNodeBalancerConfigMapOutputWithContext(context.Context) NodeBalancerConfigMapOutput
}

type NodeBalancerConfigMap map[string]NodeBalancerConfigInput

func (NodeBalancerConfigMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NodeBalancerConfig)(nil)).Elem()
}

func (i NodeBalancerConfigMap) ToNodeBalancerConfigMapOutput() NodeBalancerConfigMapOutput {
	return i.ToNodeBalancerConfigMapOutputWithContext(context.Background())
}

func (i NodeBalancerConfigMap) ToNodeBalancerConfigMapOutputWithContext(ctx context.Context) NodeBalancerConfigMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NodeBalancerConfigMapOutput)
}

type NodeBalancerConfigOutput struct{ *pulumi.OutputState }

func (NodeBalancerConfigOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*NodeBalancerConfig)(nil))
}

func (o NodeBalancerConfigOutput) ToNodeBalancerConfigOutput() NodeBalancerConfigOutput {
	return o
}

func (o NodeBalancerConfigOutput) ToNodeBalancerConfigOutputWithContext(ctx context.Context) NodeBalancerConfigOutput {
	return o
}

func (o NodeBalancerConfigOutput) ToNodeBalancerConfigPtrOutput() NodeBalancerConfigPtrOutput {
	return o.ToNodeBalancerConfigPtrOutputWithContext(context.Background())
}

func (o NodeBalancerConfigOutput) ToNodeBalancerConfigPtrOutputWithContext(ctx context.Context) NodeBalancerConfigPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v NodeBalancerConfig) *NodeBalancerConfig {
		return &v
	}).(NodeBalancerConfigPtrOutput)
}

type NodeBalancerConfigPtrOutput struct{ *pulumi.OutputState }

func (NodeBalancerConfigPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NodeBalancerConfig)(nil))
}

func (o NodeBalancerConfigPtrOutput) ToNodeBalancerConfigPtrOutput() NodeBalancerConfigPtrOutput {
	return o
}

func (o NodeBalancerConfigPtrOutput) ToNodeBalancerConfigPtrOutputWithContext(ctx context.Context) NodeBalancerConfigPtrOutput {
	return o
}

func (o NodeBalancerConfigPtrOutput) Elem() NodeBalancerConfigOutput {
	return o.ApplyT(func(v *NodeBalancerConfig) NodeBalancerConfig {
		if v != nil {
			return *v
		}
		var ret NodeBalancerConfig
		return ret
	}).(NodeBalancerConfigOutput)
}

type NodeBalancerConfigArrayOutput struct{ *pulumi.OutputState }

func (NodeBalancerConfigArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]NodeBalancerConfig)(nil))
}

func (o NodeBalancerConfigArrayOutput) ToNodeBalancerConfigArrayOutput() NodeBalancerConfigArrayOutput {
	return o
}

func (o NodeBalancerConfigArrayOutput) ToNodeBalancerConfigArrayOutputWithContext(ctx context.Context) NodeBalancerConfigArrayOutput {
	return o
}

func (o NodeBalancerConfigArrayOutput) Index(i pulumi.IntInput) NodeBalancerConfigOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) NodeBalancerConfig {
		return vs[0].([]NodeBalancerConfig)[vs[1].(int)]
	}).(NodeBalancerConfigOutput)
}

type NodeBalancerConfigMapOutput struct{ *pulumi.OutputState }

func (NodeBalancerConfigMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]NodeBalancerConfig)(nil))
}

func (o NodeBalancerConfigMapOutput) ToNodeBalancerConfigMapOutput() NodeBalancerConfigMapOutput {
	return o
}

func (o NodeBalancerConfigMapOutput) ToNodeBalancerConfigMapOutputWithContext(ctx context.Context) NodeBalancerConfigMapOutput {
	return o
}

func (o NodeBalancerConfigMapOutput) MapIndex(k pulumi.StringInput) NodeBalancerConfigOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) NodeBalancerConfig {
		return vs[0].(map[string]NodeBalancerConfig)[vs[1].(string)]
	}).(NodeBalancerConfigOutput)
}

func init() {
	pulumi.RegisterOutputType(NodeBalancerConfigOutput{})
	pulumi.RegisterOutputType(NodeBalancerConfigPtrOutput{})
	pulumi.RegisterOutputType(NodeBalancerConfigArrayOutput{})
	pulumi.RegisterOutputType(NodeBalancerConfigMapOutput{})
}
