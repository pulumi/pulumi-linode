// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Linode Domain Record resource.  This can be used to create, modify, and delete Linodes Domain Records.
// For more information, see [DNS Manager](https://www.linode.com/docs/platform/manager/dns-manager/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createDomainRecord).
//
// ## Example Usage
//
// The following example shows how one might use this resource to configure a Domain Record attached to a Linode Domain.
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			foobarDomain, err := linode.NewDomain(ctx, "foobarDomain", &linode.DomainArgs{
//				Type:     pulumi.String("master"),
//				Domain:   pulumi.String("foobar.example"),
//				SoaEmail: pulumi.String("example@foobar.example"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = linode.NewDomainRecord(ctx, "foobarDomainRecord", &linode.DomainRecordArgs{
//				DomainId:   foobarDomain.ID(),
//				Name:       pulumi.String("www"),
//				RecordType: pulumi.String("CNAME"),
//				Target:     pulumi.String("foobar.example"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Linodes Domain Records can be imported using the Linode Domain `id` followed by the Domain Record `id` separated by a comma, e.g.
//
// ```sh
// $ pulumi import linode:index/domainRecord:DomainRecord www-foobar 1234567,7654321
// ```
type DomainRecord struct {
	pulumi.CustomResourceState

	// The ID of the Domain to access.  *Changing `domainId` forces the creation of a new Linode Domain Record.*.
	DomainId pulumi.IntOutput `pulumi:"domainId"`
	// The name of this Record. Setting this is invalid for `SRV` records as it is generated by the API. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the subdomain being associated with an IP address.
	Name pulumi.StringOutput `pulumi:"name"`
	// The port this Record points to.
	Port pulumi.IntPtrOutput `pulumi:"port"`
	// The priority of the target host. Lower values are preferred.
	Priority pulumi.IntPtrOutput `pulumi:"priority"`
	// The protocol this Record's service communicates with. Only valid for SRV records.
	Protocol pulumi.StringPtrOutput `pulumi:"protocol"`
	// The type of Record this is in the DNS system. For example, A records associate a domain name with an IPv4 address, and AAAA records associate a domain name with an IPv6 address. See all supported record types [here](https://www.linode.com/docs/api/domains/#domain-record-create__request-body-schema). *Changing `recordType` forces the creation of a new Linode Domain Record.*.
	RecordType pulumi.StringOutput `pulumi:"recordType"`
	// The service this Record identified. Only valid for SRV records.
	Service pulumi.StringPtrOutput `pulumi:"service"`
	// The tag portion of a CAA record. It is invalid to set this on other record types.
	Tag pulumi.StringPtrOutput `pulumi:"tag"`
	// The target for this Record. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.
	//
	// ***
	Target pulumi.StringOutput `pulumi:"target"`
	// 'Time to Live' - the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers. Valid values are 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
	TtlSec pulumi.IntPtrOutput `pulumi:"ttlSec"`
	// The relative weight of this Record. Higher values are preferred.
	Weight pulumi.IntPtrOutput `pulumi:"weight"`
}

// NewDomainRecord registers a new resource with the given unique name, arguments, and options.
func NewDomainRecord(ctx *pulumi.Context,
	name string, args *DomainRecordArgs, opts ...pulumi.ResourceOption) (*DomainRecord, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DomainId == nil {
		return nil, errors.New("invalid value for required argument 'DomainId'")
	}
	if args.RecordType == nil {
		return nil, errors.New("invalid value for required argument 'RecordType'")
	}
	if args.Target == nil {
		return nil, errors.New("invalid value for required argument 'Target'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DomainRecord
	err := ctx.RegisterResource("linode:index/domainRecord:DomainRecord", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDomainRecord gets an existing DomainRecord resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDomainRecord(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DomainRecordState, opts ...pulumi.ResourceOption) (*DomainRecord, error) {
	var resource DomainRecord
	err := ctx.ReadResource("linode:index/domainRecord:DomainRecord", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DomainRecord resources.
type domainRecordState struct {
	// The ID of the Domain to access.  *Changing `domainId` forces the creation of a new Linode Domain Record.*.
	DomainId *int `pulumi:"domainId"`
	// The name of this Record. Setting this is invalid for `SRV` records as it is generated by the API. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the subdomain being associated with an IP address.
	Name *string `pulumi:"name"`
	// The port this Record points to.
	Port *int `pulumi:"port"`
	// The priority of the target host. Lower values are preferred.
	Priority *int `pulumi:"priority"`
	// The protocol this Record's service communicates with. Only valid for SRV records.
	Protocol *string `pulumi:"protocol"`
	// The type of Record this is in the DNS system. For example, A records associate a domain name with an IPv4 address, and AAAA records associate a domain name with an IPv6 address. See all supported record types [here](https://www.linode.com/docs/api/domains/#domain-record-create__request-body-schema). *Changing `recordType` forces the creation of a new Linode Domain Record.*.
	RecordType *string `pulumi:"recordType"`
	// The service this Record identified. Only valid for SRV records.
	Service *string `pulumi:"service"`
	// The tag portion of a CAA record. It is invalid to set this on other record types.
	Tag *string `pulumi:"tag"`
	// The target for this Record. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.
	//
	// ***
	Target *string `pulumi:"target"`
	// 'Time to Live' - the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers. Valid values are 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
	TtlSec *int `pulumi:"ttlSec"`
	// The relative weight of this Record. Higher values are preferred.
	Weight *int `pulumi:"weight"`
}

type DomainRecordState struct {
	// The ID of the Domain to access.  *Changing `domainId` forces the creation of a new Linode Domain Record.*.
	DomainId pulumi.IntPtrInput
	// The name of this Record. Setting this is invalid for `SRV` records as it is generated by the API. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the subdomain being associated with an IP address.
	Name pulumi.StringPtrInput
	// The port this Record points to.
	Port pulumi.IntPtrInput
	// The priority of the target host. Lower values are preferred.
	Priority pulumi.IntPtrInput
	// The protocol this Record's service communicates with. Only valid for SRV records.
	Protocol pulumi.StringPtrInput
	// The type of Record this is in the DNS system. For example, A records associate a domain name with an IPv4 address, and AAAA records associate a domain name with an IPv6 address. See all supported record types [here](https://www.linode.com/docs/api/domains/#domain-record-create__request-body-schema). *Changing `recordType` forces the creation of a new Linode Domain Record.*.
	RecordType pulumi.StringPtrInput
	// The service this Record identified. Only valid for SRV records.
	Service pulumi.StringPtrInput
	// The tag portion of a CAA record. It is invalid to set this on other record types.
	Tag pulumi.StringPtrInput
	// The target for this Record. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.
	//
	// ***
	Target pulumi.StringPtrInput
	// 'Time to Live' - the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers. Valid values are 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
	TtlSec pulumi.IntPtrInput
	// The relative weight of this Record. Higher values are preferred.
	Weight pulumi.IntPtrInput
}

func (DomainRecordState) ElementType() reflect.Type {
	return reflect.TypeOf((*domainRecordState)(nil)).Elem()
}

type domainRecordArgs struct {
	// The ID of the Domain to access.  *Changing `domainId` forces the creation of a new Linode Domain Record.*.
	DomainId int `pulumi:"domainId"`
	// The name of this Record. Setting this is invalid for `SRV` records as it is generated by the API. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the subdomain being associated with an IP address.
	Name *string `pulumi:"name"`
	// The port this Record points to.
	Port *int `pulumi:"port"`
	// The priority of the target host. Lower values are preferred.
	Priority *int `pulumi:"priority"`
	// The protocol this Record's service communicates with. Only valid for SRV records.
	Protocol *string `pulumi:"protocol"`
	// The type of Record this is in the DNS system. For example, A records associate a domain name with an IPv4 address, and AAAA records associate a domain name with an IPv6 address. See all supported record types [here](https://www.linode.com/docs/api/domains/#domain-record-create__request-body-schema). *Changing `recordType` forces the creation of a new Linode Domain Record.*.
	RecordType string `pulumi:"recordType"`
	// The service this Record identified. Only valid for SRV records.
	Service *string `pulumi:"service"`
	// The tag portion of a CAA record. It is invalid to set this on other record types.
	Tag *string `pulumi:"tag"`
	// The target for this Record. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.
	//
	// ***
	Target string `pulumi:"target"`
	// 'Time to Live' - the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers. Valid values are 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
	TtlSec *int `pulumi:"ttlSec"`
	// The relative weight of this Record. Higher values are preferred.
	Weight *int `pulumi:"weight"`
}

// The set of arguments for constructing a DomainRecord resource.
type DomainRecordArgs struct {
	// The ID of the Domain to access.  *Changing `domainId` forces the creation of a new Linode Domain Record.*.
	DomainId pulumi.IntInput
	// The name of this Record. Setting this is invalid for `SRV` records as it is generated by the API. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the subdomain being associated with an IP address.
	Name pulumi.StringPtrInput
	// The port this Record points to.
	Port pulumi.IntPtrInput
	// The priority of the target host. Lower values are preferred.
	Priority pulumi.IntPtrInput
	// The protocol this Record's service communicates with. Only valid for SRV records.
	Protocol pulumi.StringPtrInput
	// The type of Record this is in the DNS system. For example, A records associate a domain name with an IPv4 address, and AAAA records associate a domain name with an IPv6 address. See all supported record types [here](https://www.linode.com/docs/api/domains/#domain-record-create__request-body-schema). *Changing `recordType` forces the creation of a new Linode Domain Record.*.
	RecordType pulumi.StringInput
	// The service this Record identified. Only valid for SRV records.
	Service pulumi.StringPtrInput
	// The tag portion of a CAA record. It is invalid to set this on other record types.
	Tag pulumi.StringPtrInput
	// The target for this Record. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.
	//
	// ***
	Target pulumi.StringInput
	// 'Time to Live' - the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers. Valid values are 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
	TtlSec pulumi.IntPtrInput
	// The relative weight of this Record. Higher values are preferred.
	Weight pulumi.IntPtrInput
}

func (DomainRecordArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*domainRecordArgs)(nil)).Elem()
}

type DomainRecordInput interface {
	pulumi.Input

	ToDomainRecordOutput() DomainRecordOutput
	ToDomainRecordOutputWithContext(ctx context.Context) DomainRecordOutput
}

func (*DomainRecord) ElementType() reflect.Type {
	return reflect.TypeOf((**DomainRecord)(nil)).Elem()
}

func (i *DomainRecord) ToDomainRecordOutput() DomainRecordOutput {
	return i.ToDomainRecordOutputWithContext(context.Background())
}

func (i *DomainRecord) ToDomainRecordOutputWithContext(ctx context.Context) DomainRecordOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DomainRecordOutput)
}

// DomainRecordArrayInput is an input type that accepts DomainRecordArray and DomainRecordArrayOutput values.
// You can construct a concrete instance of `DomainRecordArrayInput` via:
//
//	DomainRecordArray{ DomainRecordArgs{...} }
type DomainRecordArrayInput interface {
	pulumi.Input

	ToDomainRecordArrayOutput() DomainRecordArrayOutput
	ToDomainRecordArrayOutputWithContext(context.Context) DomainRecordArrayOutput
}

type DomainRecordArray []DomainRecordInput

func (DomainRecordArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DomainRecord)(nil)).Elem()
}

func (i DomainRecordArray) ToDomainRecordArrayOutput() DomainRecordArrayOutput {
	return i.ToDomainRecordArrayOutputWithContext(context.Background())
}

func (i DomainRecordArray) ToDomainRecordArrayOutputWithContext(ctx context.Context) DomainRecordArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DomainRecordArrayOutput)
}

// DomainRecordMapInput is an input type that accepts DomainRecordMap and DomainRecordMapOutput values.
// You can construct a concrete instance of `DomainRecordMapInput` via:
//
//	DomainRecordMap{ "key": DomainRecordArgs{...} }
type DomainRecordMapInput interface {
	pulumi.Input

	ToDomainRecordMapOutput() DomainRecordMapOutput
	ToDomainRecordMapOutputWithContext(context.Context) DomainRecordMapOutput
}

type DomainRecordMap map[string]DomainRecordInput

func (DomainRecordMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DomainRecord)(nil)).Elem()
}

func (i DomainRecordMap) ToDomainRecordMapOutput() DomainRecordMapOutput {
	return i.ToDomainRecordMapOutputWithContext(context.Background())
}

func (i DomainRecordMap) ToDomainRecordMapOutputWithContext(ctx context.Context) DomainRecordMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DomainRecordMapOutput)
}

type DomainRecordOutput struct{ *pulumi.OutputState }

func (DomainRecordOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DomainRecord)(nil)).Elem()
}

func (o DomainRecordOutput) ToDomainRecordOutput() DomainRecordOutput {
	return o
}

func (o DomainRecordOutput) ToDomainRecordOutputWithContext(ctx context.Context) DomainRecordOutput {
	return o
}

// The ID of the Domain to access.  *Changing `domainId` forces the creation of a new Linode Domain Record.*.
func (o DomainRecordOutput) DomainId() pulumi.IntOutput {
	return o.ApplyT(func(v *DomainRecord) pulumi.IntOutput { return v.DomainId }).(pulumi.IntOutput)
}

// The name of this Record. Setting this is invalid for `SRV` records as it is generated by the API. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the subdomain being associated with an IP address.
func (o DomainRecordOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *DomainRecord) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The port this Record points to.
func (o DomainRecordOutput) Port() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *DomainRecord) pulumi.IntPtrOutput { return v.Port }).(pulumi.IntPtrOutput)
}

// The priority of the target host. Lower values are preferred.
func (o DomainRecordOutput) Priority() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *DomainRecord) pulumi.IntPtrOutput { return v.Priority }).(pulumi.IntPtrOutput)
}

// The protocol this Record's service communicates with. Only valid for SRV records.
func (o DomainRecordOutput) Protocol() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DomainRecord) pulumi.StringPtrOutput { return v.Protocol }).(pulumi.StringPtrOutput)
}

// The type of Record this is in the DNS system. For example, A records associate a domain name with an IPv4 address, and AAAA records associate a domain name with an IPv6 address. See all supported record types [here](https://www.linode.com/docs/api/domains/#domain-record-create__request-body-schema). *Changing `recordType` forces the creation of a new Linode Domain Record.*.
func (o DomainRecordOutput) RecordType() pulumi.StringOutput {
	return o.ApplyT(func(v *DomainRecord) pulumi.StringOutput { return v.RecordType }).(pulumi.StringOutput)
}

// The service this Record identified. Only valid for SRV records.
func (o DomainRecordOutput) Service() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DomainRecord) pulumi.StringPtrOutput { return v.Service }).(pulumi.StringPtrOutput)
}

// The tag portion of a CAA record. It is invalid to set this on other record types.
func (o DomainRecordOutput) Tag() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DomainRecord) pulumi.StringPtrOutput { return v.Tag }).(pulumi.StringPtrOutput)
}

// The target for this Record. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.
//
// ***
func (o DomainRecordOutput) Target() pulumi.StringOutput {
	return o.ApplyT(func(v *DomainRecord) pulumi.StringOutput { return v.Target }).(pulumi.StringOutput)
}

// 'Time to Live' - the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers. Valid values are 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
func (o DomainRecordOutput) TtlSec() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *DomainRecord) pulumi.IntPtrOutput { return v.TtlSec }).(pulumi.IntPtrOutput)
}

// The relative weight of this Record. Higher values are preferred.
func (o DomainRecordOutput) Weight() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *DomainRecord) pulumi.IntPtrOutput { return v.Weight }).(pulumi.IntPtrOutput)
}

type DomainRecordArrayOutput struct{ *pulumi.OutputState }

func (DomainRecordArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DomainRecord)(nil)).Elem()
}

func (o DomainRecordArrayOutput) ToDomainRecordArrayOutput() DomainRecordArrayOutput {
	return o
}

func (o DomainRecordArrayOutput) ToDomainRecordArrayOutputWithContext(ctx context.Context) DomainRecordArrayOutput {
	return o
}

func (o DomainRecordArrayOutput) Index(i pulumi.IntInput) DomainRecordOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DomainRecord {
		return vs[0].([]*DomainRecord)[vs[1].(int)]
	}).(DomainRecordOutput)
}

type DomainRecordMapOutput struct{ *pulumi.OutputState }

func (DomainRecordMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DomainRecord)(nil)).Elem()
}

func (o DomainRecordMapOutput) ToDomainRecordMapOutput() DomainRecordMapOutput {
	return o
}

func (o DomainRecordMapOutput) ToDomainRecordMapOutputWithContext(ctx context.Context) DomainRecordMapOutput {
	return o
}

func (o DomainRecordMapOutput) MapIndex(k pulumi.StringInput) DomainRecordOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DomainRecord {
		return vs[0].(map[string]*DomainRecord)[vs[1].(string)]
	}).(DomainRecordOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DomainRecordInput)(nil)).Elem(), &DomainRecord{})
	pulumi.RegisterInputType(reflect.TypeOf((*DomainRecordArrayInput)(nil)).Elem(), DomainRecordArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DomainRecordMapInput)(nil)).Elem(), DomainRecordMap{})
	pulumi.RegisterOutputType(DomainRecordOutput{})
	pulumi.RegisterOutputType(DomainRecordArrayOutput{})
	pulumi.RegisterOutputType(DomainRecordMapOutput{})
}
