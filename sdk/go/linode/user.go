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

// Manages a Linode User.
//
// ## Example Usage
//
// Create an unrestricted user:
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
//			_, err := linode.NewUser(ctx, "john", &linode.UserArgs{
//				Email:    pulumi.String("john@acme.io"),
//				Username: pulumi.String("john123"),
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
// Create a restricted user with grants:
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
//			_, err := linode.NewUser(ctx, "fooser", &linode.UserArgs{
//				Email: pulumi.String("cool@acme.io"),
//				GlobalGrants: &linode.UserGlobalGrantsArgs{
//					AddImages:  pulumi.Bool(true),
//					AddLinodes: pulumi.Bool(true),
//				},
//				LinodeGrants: linode.UserLinodeGrantArray{
//					&linode.UserLinodeGrantArgs{
//						Id:          pulumi.Int(12345),
//						Permissions: pulumi.String("read_write"),
//					},
//				},
//				Restricted: pulumi.Bool(true),
//				Username:   pulumi.String("cooluser123"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ## Global Grants
//
// * `account-access` - (optional) The level of access this User has to Account-level actions, like billing information. (`readOnly`, `readWrite`)
//
// * `addDomains` - (optional) If true, this User may add Domains.
//
// * `addDatabases` - (optional) If true, this User may add Databases.
//
// * `addFirewalls` - (optional) If true, this User may add Firewalls.
//
// * `addImages` - (optional) If true, this User may add Images.
//
// * `addLinodes` - (optional) If true, this User may create Linodes.
//
// * `addLongview` - (optional) If true, this User may create Longview clients and view the current plan.
//
// * `addNodebalancers` - (optional) If true, this User may add NodeBalancers.
//
// * `addStackscripts` - (optional) If true, this User may add StackScripts.
//
// * `cancelAccount` - (optional) If true, this User may cancel the entire Account.
//
// * `longviewSubscription` - (optional) If true, this User may manage the Account’s Longview subscription.
//
// ## Entity Grants
//
// * `id` - (required) The ID of the entity this grant applies to.
//
// * `permissions` - (required) The level of access this User has to this entity. (`readOnly`, `readWrite`)
type User struct {
	pulumi.CustomResourceState

	// The domains the user has permissions access to.
	DomainGrants UserDomainGrantArrayOutput `pulumi:"domainGrants"`
	// The email address of the user.
	Email pulumi.StringOutput `pulumi:"email"`
	// The firewalls the user has permissions access to.
	FirewallGrants UserFirewallGrantArrayOutput `pulumi:"firewallGrants"`
	// `globalGrants` - (optional) A structure containing the Account-level grants a User has.
	//
	// The following arguments are sets of entity grants:
	GlobalGrants UserGlobalGrantsOutput `pulumi:"globalGrants"`
	// The images the user has permissions access to.
	ImageGrants UserImageGrantArrayOutput `pulumi:"imageGrants"`
	// The Linodes the user has permissions access to.
	LinodeGrants UserLinodeGrantArrayOutput `pulumi:"linodeGrants"`
	// The longview the user has permissions access to.
	LongviewGrants UserLongviewGrantArrayOutput `pulumi:"longviewGrants"`
	// The NodeBalancers the user has permissions access to.
	NodebalancerGrants UserNodebalancerGrantArrayOutput `pulumi:"nodebalancerGrants"`
	// If true, this user will only have explicit permissions granted.
	Restricted pulumi.BoolPtrOutput `pulumi:"restricted"`
	// A list of the User's SSH keys.
	SshKeys pulumi.StringArrayOutput `pulumi:"sshKeys"`
	// The StackScripts the user has permissions access to.
	StackscriptGrants UserStackscriptGrantArrayOutput `pulumi:"stackscriptGrants"`
	// Whether the user has two-factor-authentication enabled.
	TfaEnabled pulumi.BoolOutput `pulumi:"tfaEnabled"`
	// The username of the user.
	Username pulumi.StringOutput `pulumi:"username"`
	// The volumes the user has permissions access to.
	VolumeGrants UserVolumeGrantArrayOutput `pulumi:"volumeGrants"`
}

// NewUser registers a new resource with the given unique name, arguments, and options.
func NewUser(ctx *pulumi.Context,
	name string, args *UserArgs, opts ...pulumi.ResourceOption) (*User, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Email == nil {
		return nil, errors.New("invalid value for required argument 'Email'")
	}
	if args.Username == nil {
		return nil, errors.New("invalid value for required argument 'Username'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource User
	err := ctx.RegisterResource("linode:index/user:User", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUser gets an existing User resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUser(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserState, opts ...pulumi.ResourceOption) (*User, error) {
	var resource User
	err := ctx.ReadResource("linode:index/user:User", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering User resources.
type userState struct {
	// The domains the user has permissions access to.
	DomainGrants []UserDomainGrant `pulumi:"domainGrants"`
	// The email address of the user.
	Email *string `pulumi:"email"`
	// The firewalls the user has permissions access to.
	FirewallGrants []UserFirewallGrant `pulumi:"firewallGrants"`
	// `globalGrants` - (optional) A structure containing the Account-level grants a User has.
	//
	// The following arguments are sets of entity grants:
	GlobalGrants *UserGlobalGrants `pulumi:"globalGrants"`
	// The images the user has permissions access to.
	ImageGrants []UserImageGrant `pulumi:"imageGrants"`
	// The Linodes the user has permissions access to.
	LinodeGrants []UserLinodeGrant `pulumi:"linodeGrants"`
	// The longview the user has permissions access to.
	LongviewGrants []UserLongviewGrant `pulumi:"longviewGrants"`
	// The NodeBalancers the user has permissions access to.
	NodebalancerGrants []UserNodebalancerGrant `pulumi:"nodebalancerGrants"`
	// If true, this user will only have explicit permissions granted.
	Restricted *bool `pulumi:"restricted"`
	// A list of the User's SSH keys.
	SshKeys []string `pulumi:"sshKeys"`
	// The StackScripts the user has permissions access to.
	StackscriptGrants []UserStackscriptGrant `pulumi:"stackscriptGrants"`
	// Whether the user has two-factor-authentication enabled.
	TfaEnabled *bool `pulumi:"tfaEnabled"`
	// The username of the user.
	Username *string `pulumi:"username"`
	// The volumes the user has permissions access to.
	VolumeGrants []UserVolumeGrant `pulumi:"volumeGrants"`
}

type UserState struct {
	// The domains the user has permissions access to.
	DomainGrants UserDomainGrantArrayInput
	// The email address of the user.
	Email pulumi.StringPtrInput
	// The firewalls the user has permissions access to.
	FirewallGrants UserFirewallGrantArrayInput
	// `globalGrants` - (optional) A structure containing the Account-level grants a User has.
	//
	// The following arguments are sets of entity grants:
	GlobalGrants UserGlobalGrantsPtrInput
	// The images the user has permissions access to.
	ImageGrants UserImageGrantArrayInput
	// The Linodes the user has permissions access to.
	LinodeGrants UserLinodeGrantArrayInput
	// The longview the user has permissions access to.
	LongviewGrants UserLongviewGrantArrayInput
	// The NodeBalancers the user has permissions access to.
	NodebalancerGrants UserNodebalancerGrantArrayInput
	// If true, this user will only have explicit permissions granted.
	Restricted pulumi.BoolPtrInput
	// A list of the User's SSH keys.
	SshKeys pulumi.StringArrayInput
	// The StackScripts the user has permissions access to.
	StackscriptGrants UserStackscriptGrantArrayInput
	// Whether the user has two-factor-authentication enabled.
	TfaEnabled pulumi.BoolPtrInput
	// The username of the user.
	Username pulumi.StringPtrInput
	// The volumes the user has permissions access to.
	VolumeGrants UserVolumeGrantArrayInput
}

func (UserState) ElementType() reflect.Type {
	return reflect.TypeOf((*userState)(nil)).Elem()
}

type userArgs struct {
	// The domains the user has permissions access to.
	DomainGrants []UserDomainGrant `pulumi:"domainGrants"`
	// The email address of the user.
	Email string `pulumi:"email"`
	// The firewalls the user has permissions access to.
	FirewallGrants []UserFirewallGrant `pulumi:"firewallGrants"`
	// `globalGrants` - (optional) A structure containing the Account-level grants a User has.
	//
	// The following arguments are sets of entity grants:
	GlobalGrants *UserGlobalGrants `pulumi:"globalGrants"`
	// The images the user has permissions access to.
	ImageGrants []UserImageGrant `pulumi:"imageGrants"`
	// The Linodes the user has permissions access to.
	LinodeGrants []UserLinodeGrant `pulumi:"linodeGrants"`
	// The longview the user has permissions access to.
	LongviewGrants []UserLongviewGrant `pulumi:"longviewGrants"`
	// The NodeBalancers the user has permissions access to.
	NodebalancerGrants []UserNodebalancerGrant `pulumi:"nodebalancerGrants"`
	// If true, this user will only have explicit permissions granted.
	Restricted *bool `pulumi:"restricted"`
	// The StackScripts the user has permissions access to.
	StackscriptGrants []UserStackscriptGrant `pulumi:"stackscriptGrants"`
	// The username of the user.
	Username string `pulumi:"username"`
	// The volumes the user has permissions access to.
	VolumeGrants []UserVolumeGrant `pulumi:"volumeGrants"`
}

// The set of arguments for constructing a User resource.
type UserArgs struct {
	// The domains the user has permissions access to.
	DomainGrants UserDomainGrantArrayInput
	// The email address of the user.
	Email pulumi.StringInput
	// The firewalls the user has permissions access to.
	FirewallGrants UserFirewallGrantArrayInput
	// `globalGrants` - (optional) A structure containing the Account-level grants a User has.
	//
	// The following arguments are sets of entity grants:
	GlobalGrants UserGlobalGrantsPtrInput
	// The images the user has permissions access to.
	ImageGrants UserImageGrantArrayInput
	// The Linodes the user has permissions access to.
	LinodeGrants UserLinodeGrantArrayInput
	// The longview the user has permissions access to.
	LongviewGrants UserLongviewGrantArrayInput
	// The NodeBalancers the user has permissions access to.
	NodebalancerGrants UserNodebalancerGrantArrayInput
	// If true, this user will only have explicit permissions granted.
	Restricted pulumi.BoolPtrInput
	// The StackScripts the user has permissions access to.
	StackscriptGrants UserStackscriptGrantArrayInput
	// The username of the user.
	Username pulumi.StringInput
	// The volumes the user has permissions access to.
	VolumeGrants UserVolumeGrantArrayInput
}

func (UserArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userArgs)(nil)).Elem()
}

type UserInput interface {
	pulumi.Input

	ToUserOutput() UserOutput
	ToUserOutputWithContext(ctx context.Context) UserOutput
}

func (*User) ElementType() reflect.Type {
	return reflect.TypeOf((**User)(nil)).Elem()
}

func (i *User) ToUserOutput() UserOutput {
	return i.ToUserOutputWithContext(context.Background())
}

func (i *User) ToUserOutputWithContext(ctx context.Context) UserOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserOutput)
}

// UserArrayInput is an input type that accepts UserArray and UserArrayOutput values.
// You can construct a concrete instance of `UserArrayInput` via:
//
//	UserArray{ UserArgs{...} }
type UserArrayInput interface {
	pulumi.Input

	ToUserArrayOutput() UserArrayOutput
	ToUserArrayOutputWithContext(context.Context) UserArrayOutput
}

type UserArray []UserInput

func (UserArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*User)(nil)).Elem()
}

func (i UserArray) ToUserArrayOutput() UserArrayOutput {
	return i.ToUserArrayOutputWithContext(context.Background())
}

func (i UserArray) ToUserArrayOutputWithContext(ctx context.Context) UserArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserArrayOutput)
}

// UserMapInput is an input type that accepts UserMap and UserMapOutput values.
// You can construct a concrete instance of `UserMapInput` via:
//
//	UserMap{ "key": UserArgs{...} }
type UserMapInput interface {
	pulumi.Input

	ToUserMapOutput() UserMapOutput
	ToUserMapOutputWithContext(context.Context) UserMapOutput
}

type UserMap map[string]UserInput

func (UserMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*User)(nil)).Elem()
}

func (i UserMap) ToUserMapOutput() UserMapOutput {
	return i.ToUserMapOutputWithContext(context.Background())
}

func (i UserMap) ToUserMapOutputWithContext(ctx context.Context) UserMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserMapOutput)
}

type UserOutput struct{ *pulumi.OutputState }

func (UserOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**User)(nil)).Elem()
}

func (o UserOutput) ToUserOutput() UserOutput {
	return o
}

func (o UserOutput) ToUserOutputWithContext(ctx context.Context) UserOutput {
	return o
}

// The domains the user has permissions access to.
func (o UserOutput) DomainGrants() UserDomainGrantArrayOutput {
	return o.ApplyT(func(v *User) UserDomainGrantArrayOutput { return v.DomainGrants }).(UserDomainGrantArrayOutput)
}

// The email address of the user.
func (o UserOutput) Email() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.Email }).(pulumi.StringOutput)
}

// The firewalls the user has permissions access to.
func (o UserOutput) FirewallGrants() UserFirewallGrantArrayOutput {
	return o.ApplyT(func(v *User) UserFirewallGrantArrayOutput { return v.FirewallGrants }).(UserFirewallGrantArrayOutput)
}

// `globalGrants` - (optional) A structure containing the Account-level grants a User has.
//
// The following arguments are sets of entity grants:
func (o UserOutput) GlobalGrants() UserGlobalGrantsOutput {
	return o.ApplyT(func(v *User) UserGlobalGrantsOutput { return v.GlobalGrants }).(UserGlobalGrantsOutput)
}

// The images the user has permissions access to.
func (o UserOutput) ImageGrants() UserImageGrantArrayOutput {
	return o.ApplyT(func(v *User) UserImageGrantArrayOutput { return v.ImageGrants }).(UserImageGrantArrayOutput)
}

// The Linodes the user has permissions access to.
func (o UserOutput) LinodeGrants() UserLinodeGrantArrayOutput {
	return o.ApplyT(func(v *User) UserLinodeGrantArrayOutput { return v.LinodeGrants }).(UserLinodeGrantArrayOutput)
}

// The longview the user has permissions access to.
func (o UserOutput) LongviewGrants() UserLongviewGrantArrayOutput {
	return o.ApplyT(func(v *User) UserLongviewGrantArrayOutput { return v.LongviewGrants }).(UserLongviewGrantArrayOutput)
}

// The NodeBalancers the user has permissions access to.
func (o UserOutput) NodebalancerGrants() UserNodebalancerGrantArrayOutput {
	return o.ApplyT(func(v *User) UserNodebalancerGrantArrayOutput { return v.NodebalancerGrants }).(UserNodebalancerGrantArrayOutput)
}

// If true, this user will only have explicit permissions granted.
func (o UserOutput) Restricted() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *User) pulumi.BoolPtrOutput { return v.Restricted }).(pulumi.BoolPtrOutput)
}

// A list of the User's SSH keys.
func (o UserOutput) SshKeys() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *User) pulumi.StringArrayOutput { return v.SshKeys }).(pulumi.StringArrayOutput)
}

// The StackScripts the user has permissions access to.
func (o UserOutput) StackscriptGrants() UserStackscriptGrantArrayOutput {
	return o.ApplyT(func(v *User) UserStackscriptGrantArrayOutput { return v.StackscriptGrants }).(UserStackscriptGrantArrayOutput)
}

// Whether the user has two-factor-authentication enabled.
func (o UserOutput) TfaEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *User) pulumi.BoolOutput { return v.TfaEnabled }).(pulumi.BoolOutput)
}

// The username of the user.
func (o UserOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.Username }).(pulumi.StringOutput)
}

// The volumes the user has permissions access to.
func (o UserOutput) VolumeGrants() UserVolumeGrantArrayOutput {
	return o.ApplyT(func(v *User) UserVolumeGrantArrayOutput { return v.VolumeGrants }).(UserVolumeGrantArrayOutput)
}

type UserArrayOutput struct{ *pulumi.OutputState }

func (UserArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*User)(nil)).Elem()
}

func (o UserArrayOutput) ToUserArrayOutput() UserArrayOutput {
	return o
}

func (o UserArrayOutput) ToUserArrayOutputWithContext(ctx context.Context) UserArrayOutput {
	return o
}

func (o UserArrayOutput) Index(i pulumi.IntInput) UserOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *User {
		return vs[0].([]*User)[vs[1].(int)]
	}).(UserOutput)
}

type UserMapOutput struct{ *pulumi.OutputState }

func (UserMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*User)(nil)).Elem()
}

func (o UserMapOutput) ToUserMapOutput() UserMapOutput {
	return o
}

func (o UserMapOutput) ToUserMapOutputWithContext(ctx context.Context) UserMapOutput {
	return o
}

func (o UserMapOutput) MapIndex(k pulumi.StringInput) UserOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *User {
		return vs[0].(map[string]*User)[vs[1].(string)]
	}).(UserOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UserInput)(nil)).Elem(), &User{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserArrayInput)(nil)).Elem(), UserArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserMapInput)(nil)).Elem(), UserMap{})
	pulumi.RegisterOutputType(UserOutput{})
	pulumi.RegisterOutputType(UserArrayOutput{})
	pulumi.RegisterOutputType(UserMapOutput{})
}
