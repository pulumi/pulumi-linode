// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The provider type for the linode package. By default, resources use package-wide configuration
// settings, however an explicit `Provider` instance may be created and passed during resource
// construction to achieve fine-grained programmatic control over provider settings. See the
// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
type Provider struct {
	pulumi.ProviderResourceState

	// An HTTP User-Agent Prefix to prepend in API requests.
	ApiVersion    pulumi.StringPtrOutput `pulumi:"apiVersion"`
	ConfigPath    pulumi.StringPtrOutput `pulumi:"configPath"`
	ConfigProfile pulumi.StringPtrOutput `pulumi:"configProfile"`
	// The token that allows you access to your Linode account
	Token pulumi.StringPtrOutput `pulumi:"token"`
	// An HTTP User-Agent Prefix to prepend in API requests.
	UaPrefix pulumi.StringPtrOutput `pulumi:"uaPrefix"`
	// The HTTP(S) API address of the Linode API to use.
	Url pulumi.StringPtrOutput `pulumi:"url"`
}

// NewProvider registers a new resource with the given unique name, arguments, and options.
func NewProvider(ctx *pulumi.Context,
	name string, args *ProviderArgs, opts ...pulumi.ResourceOption) (*Provider, error) {
	if args == nil {
		args = &ProviderArgs{}
	}

	if args.ApiVersion == nil {
		args.ApiVersion = pulumi.StringPtr(getEnvOrDefault("", nil, "LINODE_API_VERSION").(string))
	}
	if args.UaPrefix == nil {
		args.UaPrefix = pulumi.StringPtr(getEnvOrDefault("", nil, "LINODE_UA_PREFIX").(string))
	}
	if args.Url == nil {
		args.Url = pulumi.StringPtr(getEnvOrDefault("", nil, "LINODE_URL").(string))
	}
	var resource Provider
	err := ctx.RegisterResource("pulumi:providers:linode", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

type providerArgs struct {
	// An HTTP User-Agent Prefix to prepend in API requests.
	ApiVersion    *string `pulumi:"apiVersion"`
	ConfigPath    *string `pulumi:"configPath"`
	ConfigProfile *string `pulumi:"configProfile"`
	// Disable the internal caching system that backs certain Linode API requests.
	DisableInternalCache *bool `pulumi:"disableInternalCache"`
	// The rate in milliseconds to poll for events.
	EventPollMs *int `pulumi:"eventPollMs"`
	// The rate in milliseconds to poll for LKE events.
	LkeEventPollMs *int `pulumi:"lkeEventPollMs"`
	// The rate in milliseconds to poll for an LKE node to be ready.
	LkeNodeReadyPollMs *int `pulumi:"lkeNodeReadyPollMs"`
	// Maximum delay in milliseconds before retrying a request.
	MaxRetryDelayMs *int `pulumi:"maxRetryDelayMs"`
	// Minimum delay in milliseconds before retrying a request.
	MinRetryDelayMs *int `pulumi:"minRetryDelayMs"`
	// Skip waiting for a linode_instance resource to finish deleting.
	SkipInstanceDeletePoll *bool `pulumi:"skipInstanceDeletePoll"`
	// Skip waiting for a linode_instance resource to be running.
	SkipInstanceReadyPoll *bool `pulumi:"skipInstanceReadyPoll"`
	// The token that allows you access to your Linode account
	Token *string `pulumi:"token"`
	// An HTTP User-Agent Prefix to prepend in API requests.
	UaPrefix *string `pulumi:"uaPrefix"`
	// The HTTP(S) API address of the Linode API to use.
	Url *string `pulumi:"url"`
}

// The set of arguments for constructing a Provider resource.
type ProviderArgs struct {
	// An HTTP User-Agent Prefix to prepend in API requests.
	ApiVersion    pulumi.StringPtrInput
	ConfigPath    pulumi.StringPtrInput
	ConfigProfile pulumi.StringPtrInput
	// Disable the internal caching system that backs certain Linode API requests.
	DisableInternalCache pulumi.BoolPtrInput
	// The rate in milliseconds to poll for events.
	EventPollMs pulumi.IntPtrInput
	// The rate in milliseconds to poll for LKE events.
	LkeEventPollMs pulumi.IntPtrInput
	// The rate in milliseconds to poll for an LKE node to be ready.
	LkeNodeReadyPollMs pulumi.IntPtrInput
	// Maximum delay in milliseconds before retrying a request.
	MaxRetryDelayMs pulumi.IntPtrInput
	// Minimum delay in milliseconds before retrying a request.
	MinRetryDelayMs pulumi.IntPtrInput
	// Skip waiting for a linode_instance resource to finish deleting.
	SkipInstanceDeletePoll pulumi.BoolPtrInput
	// Skip waiting for a linode_instance resource to be running.
	SkipInstanceReadyPoll pulumi.BoolPtrInput
	// The token that allows you access to your Linode account
	Token pulumi.StringPtrInput
	// An HTTP User-Agent Prefix to prepend in API requests.
	UaPrefix pulumi.StringPtrInput
	// The HTTP(S) API address of the Linode API to use.
	Url pulumi.StringPtrInput
}

func (ProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*providerArgs)(nil)).Elem()
}

type ProviderInput interface {
	pulumi.Input

	ToProviderOutput() ProviderOutput
	ToProviderOutputWithContext(ctx context.Context) ProviderOutput
}

func (*Provider) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (i *Provider) ToProviderOutput() ProviderOutput {
	return i.ToProviderOutputWithContext(context.Background())
}

func (i *Provider) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderOutput)
}

type ProviderOutput struct{ *pulumi.OutputState }

func (ProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (o ProviderOutput) ToProviderOutput() ProviderOutput {
	return o
}

func (o ProviderOutput) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return o
}

// An HTTP User-Agent Prefix to prepend in API requests.
func (o ProviderOutput) ApiVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.ApiVersion }).(pulumi.StringPtrOutput)
}

func (o ProviderOutput) ConfigPath() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.ConfigPath }).(pulumi.StringPtrOutput)
}

func (o ProviderOutput) ConfigProfile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.ConfigProfile }).(pulumi.StringPtrOutput)
}

// The token that allows you access to your Linode account
func (o ProviderOutput) Token() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Token }).(pulumi.StringPtrOutput)
}

// An HTTP User-Agent Prefix to prepend in API requests.
func (o ProviderOutput) UaPrefix() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.UaPrefix }).(pulumi.StringPtrOutput)
}

// The HTTP(S) API address of the Linode API to use.
func (o ProviderOutput) Url() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Url }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderInput)(nil)).Elem(), &Provider{})
	pulumi.RegisterOutputType(ProviderOutput{})
}
