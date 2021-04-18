// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Linode Domain resource.  This can be used to create, modify, and delete Linode Domains through Linode's managed DNS service.
// For more information, see [DNS Manager](https://www.linode.com/docs/platform/manager/dns-manager/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createDomain).
//
// ## Example Usage
//
// The following example shows how one might use this resource to configure a Domain Record attached to a Linode Domain.
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
// 		foobarDomain, err := linode.NewDomain(ctx, "foobarDomain", &linode.DomainArgs{
// 			Type:     pulumi.String("master"),
// 			Domain:   pulumi.String("foobar.example"),
// 			SoaEmail: pulumi.String("example@foobar.example"),
// 			Tags: pulumi.StringArray{
// 				pulumi.String("foo"),
// 				pulumi.String("bar"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = linode.NewDomainRecord(ctx, "foobarDomainRecord", &linode.DomainRecordArgs{
// 			DomainId:   foobarDomain.ID(),
// 			Name:       pulumi.String("www"),
// 			RecordType: pulumi.String("CNAME"),
// 			Target:     pulumi.String("foobar.example"),
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
// This resource exports no additional attributes, however `status` may reflect degraded states.
//
// ## Import
//
// Linodes Domains can be imported using the Linode Domain `id`, e.g.
//
// ```sh
//  $ pulumi import linode:index/domain:Domain foobar 1234567
// ```
//
//  The Linode Guide, [Import Existing Infrastructure to Terraform](https://www.linode.com/docs/applications/configuration-management/import-existing-infrastructure-to-terraform/), offers resource importing examples for Domains and other Linode resource types.
type Domain struct {
	pulumi.CustomResourceState

	// The list of IPs that may perform a zone transfer for this Domain. This is potentially dangerous, and should be set to an empty list unless you intend to use it.
	AxfrIps pulumi.StringArrayOutput `pulumi:"axfrIps"`
	// A description for this Domain. This is for display purposes only.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The domain this Domain represents. These must be unique in our system; you cannot have two Domains representing the same domain.
	Domain pulumi.StringOutput `pulumi:"domain"`
	// The amount of time in seconds that may pass before this Domain is no longer authoritative. Valid values are 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
	ExpireSec pulumi.IntPtrOutput `pulumi:"expireSec"`
	// The group this Domain belongs to. This is for display purposes only.
	Group pulumi.StringPtrOutput `pulumi:"group"`
	// The IP addresses representing the master DNS for this Domain.
	MasterIps pulumi.StringArrayOutput `pulumi:"masterIps"`
	// The amount of time in seconds before this Domain should be refreshed. Valid values are 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
	RefreshSec pulumi.IntPtrOutput `pulumi:"refreshSec"`
	// The interval, in seconds, at which a failed refresh should be retried. Valid values are 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
	RetrySec pulumi.IntPtrOutput `pulumi:"retrySec"`
	// Start of Authority email address. This is required for master Domains.
	SoaEmail pulumi.StringPtrOutput `pulumi:"soaEmail"`
	// Used to control whether this Domain is currently being rendered (defaults to "active").
	Status pulumi.StringOutput `pulumi:"status"`
	// A list of tags applied to this object. Tags are for organizational purposes only.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// 'Time to Live' - the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers. Valid values are 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
	TtlSec pulumi.IntPtrOutput `pulumi:"ttlSec"`
	// If this Domain represents the authoritative source of information for the domain it describes, or if it is a read-only copy of a master (also called a slave).
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewDomain registers a new resource with the given unique name, arguments, and options.
func NewDomain(ctx *pulumi.Context,
	name string, args *DomainArgs, opts ...pulumi.ResourceOption) (*Domain, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Domain == nil {
		return nil, errors.New("invalid value for required argument 'Domain'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	var resource Domain
	err := ctx.RegisterResource("linode:index/domain:Domain", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDomain gets an existing Domain resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDomain(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DomainState, opts ...pulumi.ResourceOption) (*Domain, error) {
	var resource Domain
	err := ctx.ReadResource("linode:index/domain:Domain", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Domain resources.
type domainState struct {
	// The list of IPs that may perform a zone transfer for this Domain. This is potentially dangerous, and should be set to an empty list unless you intend to use it.
	AxfrIps []string `pulumi:"axfrIps"`
	// A description for this Domain. This is for display purposes only.
	Description *string `pulumi:"description"`
	// The domain this Domain represents. These must be unique in our system; you cannot have two Domains representing the same domain.
	Domain *string `pulumi:"domain"`
	// The amount of time in seconds that may pass before this Domain is no longer authoritative. Valid values are 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
	ExpireSec *int `pulumi:"expireSec"`
	// The group this Domain belongs to. This is for display purposes only.
	Group *string `pulumi:"group"`
	// The IP addresses representing the master DNS for this Domain.
	MasterIps []string `pulumi:"masterIps"`
	// The amount of time in seconds before this Domain should be refreshed. Valid values are 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
	RefreshSec *int `pulumi:"refreshSec"`
	// The interval, in seconds, at which a failed refresh should be retried. Valid values are 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
	RetrySec *int `pulumi:"retrySec"`
	// Start of Authority email address. This is required for master Domains.
	SoaEmail *string `pulumi:"soaEmail"`
	// Used to control whether this Domain is currently being rendered (defaults to "active").
	Status *string `pulumi:"status"`
	// A list of tags applied to this object. Tags are for organizational purposes only.
	Tags []string `pulumi:"tags"`
	// 'Time to Live' - the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers. Valid values are 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
	TtlSec *int `pulumi:"ttlSec"`
	// If this Domain represents the authoritative source of information for the domain it describes, or if it is a read-only copy of a master (also called a slave).
	Type *string `pulumi:"type"`
}

type DomainState struct {
	// The list of IPs that may perform a zone transfer for this Domain. This is potentially dangerous, and should be set to an empty list unless you intend to use it.
	AxfrIps pulumi.StringArrayInput
	// A description for this Domain. This is for display purposes only.
	Description pulumi.StringPtrInput
	// The domain this Domain represents. These must be unique in our system; you cannot have two Domains representing the same domain.
	Domain pulumi.StringPtrInput
	// The amount of time in seconds that may pass before this Domain is no longer authoritative. Valid values are 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
	ExpireSec pulumi.IntPtrInput
	// The group this Domain belongs to. This is for display purposes only.
	Group pulumi.StringPtrInput
	// The IP addresses representing the master DNS for this Domain.
	MasterIps pulumi.StringArrayInput
	// The amount of time in seconds before this Domain should be refreshed. Valid values are 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
	RefreshSec pulumi.IntPtrInput
	// The interval, in seconds, at which a failed refresh should be retried. Valid values are 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
	RetrySec pulumi.IntPtrInput
	// Start of Authority email address. This is required for master Domains.
	SoaEmail pulumi.StringPtrInput
	// Used to control whether this Domain is currently being rendered (defaults to "active").
	Status pulumi.StringPtrInput
	// A list of tags applied to this object. Tags are for organizational purposes only.
	Tags pulumi.StringArrayInput
	// 'Time to Live' - the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers. Valid values are 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
	TtlSec pulumi.IntPtrInput
	// If this Domain represents the authoritative source of information for the domain it describes, or if it is a read-only copy of a master (also called a slave).
	Type pulumi.StringPtrInput
}

func (DomainState) ElementType() reflect.Type {
	return reflect.TypeOf((*domainState)(nil)).Elem()
}

type domainArgs struct {
	// The list of IPs that may perform a zone transfer for this Domain. This is potentially dangerous, and should be set to an empty list unless you intend to use it.
	AxfrIps []string `pulumi:"axfrIps"`
	// A description for this Domain. This is for display purposes only.
	Description *string `pulumi:"description"`
	// The domain this Domain represents. These must be unique in our system; you cannot have two Domains representing the same domain.
	Domain string `pulumi:"domain"`
	// The amount of time in seconds that may pass before this Domain is no longer authoritative. Valid values are 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
	ExpireSec *int `pulumi:"expireSec"`
	// The group this Domain belongs to. This is for display purposes only.
	Group *string `pulumi:"group"`
	// The IP addresses representing the master DNS for this Domain.
	MasterIps []string `pulumi:"masterIps"`
	// The amount of time in seconds before this Domain should be refreshed. Valid values are 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
	RefreshSec *int `pulumi:"refreshSec"`
	// The interval, in seconds, at which a failed refresh should be retried. Valid values are 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
	RetrySec *int `pulumi:"retrySec"`
	// Start of Authority email address. This is required for master Domains.
	SoaEmail *string `pulumi:"soaEmail"`
	// Used to control whether this Domain is currently being rendered (defaults to "active").
	Status *string `pulumi:"status"`
	// A list of tags applied to this object. Tags are for organizational purposes only.
	Tags []string `pulumi:"tags"`
	// 'Time to Live' - the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers. Valid values are 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
	TtlSec *int `pulumi:"ttlSec"`
	// If this Domain represents the authoritative source of information for the domain it describes, or if it is a read-only copy of a master (also called a slave).
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a Domain resource.
type DomainArgs struct {
	// The list of IPs that may perform a zone transfer for this Domain. This is potentially dangerous, and should be set to an empty list unless you intend to use it.
	AxfrIps pulumi.StringArrayInput
	// A description for this Domain. This is for display purposes only.
	Description pulumi.StringPtrInput
	// The domain this Domain represents. These must be unique in our system; you cannot have two Domains representing the same domain.
	Domain pulumi.StringInput
	// The amount of time in seconds that may pass before this Domain is no longer authoritative. Valid values are 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
	ExpireSec pulumi.IntPtrInput
	// The group this Domain belongs to. This is for display purposes only.
	Group pulumi.StringPtrInput
	// The IP addresses representing the master DNS for this Domain.
	MasterIps pulumi.StringArrayInput
	// The amount of time in seconds before this Domain should be refreshed. Valid values are 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
	RefreshSec pulumi.IntPtrInput
	// The interval, in seconds, at which a failed refresh should be retried. Valid values are 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
	RetrySec pulumi.IntPtrInput
	// Start of Authority email address. This is required for master Domains.
	SoaEmail pulumi.StringPtrInput
	// Used to control whether this Domain is currently being rendered (defaults to "active").
	Status pulumi.StringPtrInput
	// A list of tags applied to this object. Tags are for organizational purposes only.
	Tags pulumi.StringArrayInput
	// 'Time to Live' - the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers. Valid values are 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
	TtlSec pulumi.IntPtrInput
	// If this Domain represents the authoritative source of information for the domain it describes, or if it is a read-only copy of a master (also called a slave).
	Type pulumi.StringInput
}

func (DomainArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*domainArgs)(nil)).Elem()
}

type DomainInput interface {
	pulumi.Input

	ToDomainOutput() DomainOutput
	ToDomainOutputWithContext(ctx context.Context) DomainOutput
}

func (*Domain) ElementType() reflect.Type {
	return reflect.TypeOf((*Domain)(nil))
}

func (i *Domain) ToDomainOutput() DomainOutput {
	return i.ToDomainOutputWithContext(context.Background())
}

func (i *Domain) ToDomainOutputWithContext(ctx context.Context) DomainOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DomainOutput)
}

func (i *Domain) ToDomainPtrOutput() DomainPtrOutput {
	return i.ToDomainPtrOutputWithContext(context.Background())
}

func (i *Domain) ToDomainPtrOutputWithContext(ctx context.Context) DomainPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DomainPtrOutput)
}

type DomainPtrInput interface {
	pulumi.Input

	ToDomainPtrOutput() DomainPtrOutput
	ToDomainPtrOutputWithContext(ctx context.Context) DomainPtrOutput
}

type domainPtrType DomainArgs

func (*domainPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Domain)(nil))
}

func (i *domainPtrType) ToDomainPtrOutput() DomainPtrOutput {
	return i.ToDomainPtrOutputWithContext(context.Background())
}

func (i *domainPtrType) ToDomainPtrOutputWithContext(ctx context.Context) DomainPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DomainPtrOutput)
}

// DomainArrayInput is an input type that accepts DomainArray and DomainArrayOutput values.
// You can construct a concrete instance of `DomainArrayInput` via:
//
//          DomainArray{ DomainArgs{...} }
type DomainArrayInput interface {
	pulumi.Input

	ToDomainArrayOutput() DomainArrayOutput
	ToDomainArrayOutputWithContext(context.Context) DomainArrayOutput
}

type DomainArray []DomainInput

func (DomainArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*Domain)(nil))
}

func (i DomainArray) ToDomainArrayOutput() DomainArrayOutput {
	return i.ToDomainArrayOutputWithContext(context.Background())
}

func (i DomainArray) ToDomainArrayOutputWithContext(ctx context.Context) DomainArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DomainArrayOutput)
}

// DomainMapInput is an input type that accepts DomainMap and DomainMapOutput values.
// You can construct a concrete instance of `DomainMapInput` via:
//
//          DomainMap{ "key": DomainArgs{...} }
type DomainMapInput interface {
	pulumi.Input

	ToDomainMapOutput() DomainMapOutput
	ToDomainMapOutputWithContext(context.Context) DomainMapOutput
}

type DomainMap map[string]DomainInput

func (DomainMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*Domain)(nil))
}

func (i DomainMap) ToDomainMapOutput() DomainMapOutput {
	return i.ToDomainMapOutputWithContext(context.Background())
}

func (i DomainMap) ToDomainMapOutputWithContext(ctx context.Context) DomainMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DomainMapOutput)
}

type DomainOutput struct {
	*pulumi.OutputState
}

func (DomainOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Domain)(nil))
}

func (o DomainOutput) ToDomainOutput() DomainOutput {
	return o
}

func (o DomainOutput) ToDomainOutputWithContext(ctx context.Context) DomainOutput {
	return o
}

func (o DomainOutput) ToDomainPtrOutput() DomainPtrOutput {
	return o.ToDomainPtrOutputWithContext(context.Background())
}

func (o DomainOutput) ToDomainPtrOutputWithContext(ctx context.Context) DomainPtrOutput {
	return o.ApplyT(func(v Domain) *Domain {
		return &v
	}).(DomainPtrOutput)
}

type DomainPtrOutput struct {
	*pulumi.OutputState
}

func (DomainPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Domain)(nil))
}

func (o DomainPtrOutput) ToDomainPtrOutput() DomainPtrOutput {
	return o
}

func (o DomainPtrOutput) ToDomainPtrOutputWithContext(ctx context.Context) DomainPtrOutput {
	return o
}

type DomainArrayOutput struct{ *pulumi.OutputState }

func (DomainArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Domain)(nil))
}

func (o DomainArrayOutput) ToDomainArrayOutput() DomainArrayOutput {
	return o
}

func (o DomainArrayOutput) ToDomainArrayOutputWithContext(ctx context.Context) DomainArrayOutput {
	return o
}

func (o DomainArrayOutput) Index(i pulumi.IntInput) DomainOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Domain {
		return vs[0].([]Domain)[vs[1].(int)]
	}).(DomainOutput)
}

type DomainMapOutput struct{ *pulumi.OutputState }

func (DomainMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Domain)(nil))
}

func (o DomainMapOutput) ToDomainMapOutput() DomainMapOutput {
	return o
}

func (o DomainMapOutput) ToDomainMapOutputWithContext(ctx context.Context) DomainMapOutput {
	return o
}

func (o DomainMapOutput) MapIndex(k pulumi.StringInput) DomainOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Domain {
		return vs[0].(map[string]Domain)[vs[1].(string)]
	}).(DomainOutput)
}

func init() {
	pulumi.RegisterOutputType(DomainOutput{})
	pulumi.RegisterOutputType(DomainPtrOutput{})
	pulumi.RegisterOutputType(DomainArrayOutput{})
	pulumi.RegisterOutputType(DomainMapOutput{})
}
