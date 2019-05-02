// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a Linode RDNS resource.  This can be used to create and modify RDNS records.
// 
// Linode RDNS names must have a matching address value in an A or AAAA record.  This A or AAAA name must be resolvable at the time the RDNS resource is being associated.
// 
// For more information, see the [Linode APIv4 docs](https://developers.linode.com/api/docs/v4#operation/updateIP) and the [Configure your Linode for Reverse DNS](https://www.linode.com/docs/networking/dns/configure-your-linode-for-reverse-dns-classic-manager/) guide.
type Rdns struct {
	s *pulumi.ResourceState
}

// NewRdns registers a new resource with the given unique name, arguments, and options.
func NewRdns(ctx *pulumi.Context,
	name string, args *RdnsArgs, opts ...pulumi.ResourceOpt) (*Rdns, error) {
	if args == nil || args.Address == nil {
		return nil, errors.New("missing required argument 'Address'")
	}
	if args == nil || args.Rdns == nil {
		return nil, errors.New("missing required argument 'Rdns'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["address"] = nil
		inputs["rdns"] = nil
	} else {
		inputs["address"] = args.Address
		inputs["rdns"] = args.Rdns
	}
	s, err := ctx.RegisterResource("linode:index/rdns:Rdns", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &Rdns{s: s}, nil
}

// GetRdns gets an existing Rdns resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRdns(ctx *pulumi.Context,
	name string, id pulumi.ID, state *RdnsState, opts ...pulumi.ResourceOpt) (*Rdns, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["address"] = state.Address
		inputs["rdns"] = state.Rdns
	}
	s, err := ctx.ReadResource("linode:index/rdns:Rdns", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &Rdns{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *Rdns) URN() *pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *Rdns) ID() *pulumi.IDOutput {
	return r.s.ID()
}

// The Public IPv4 or IPv6 address that will receive the `PTR` record.  A matching `A` or `AAAA` record must exist.
func (r *Rdns) Address() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["address"])
}

// The name of the RDNS address.
func (r *Rdns) Rdns() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["rdns"])
}

// Input properties used for looking up and filtering Rdns resources.
type RdnsState struct {
	// The Public IPv4 or IPv6 address that will receive the `PTR` record.  A matching `A` or `AAAA` record must exist.
	Address interface{}
	// The name of the RDNS address.
	Rdns interface{}
}

// The set of arguments for constructing a Rdns resource.
type RdnsArgs struct {
	// The Public IPv4 or IPv6 address that will receive the `PTR` record.  A matching `A` or `AAAA` record must exist.
	Address interface{}
	// The name of the RDNS address.
	Rdns interface{}
}
