// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about a Linode user
//
// ## Example Usage
//
// The following example shows how one might use this data source to access information about a Linode user.
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
//			_, err := linode.LookupUser(ctx, &linode.LookupUserArgs{
//				Username: "foo",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// The following example shows a sample grant.
func LookupUser(ctx *pulumi.Context, args *LookupUserArgs, opts ...pulumi.InvokeOption) (*LookupUserResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupUserResult
	err := ctx.Invoke("linode:index/getUser:getUser", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getUser.
type LookupUserArgs struct {
	DatabaseGrants     []GetUserDatabaseGrant     `pulumi:"databaseGrants"`
	DomainGrants       []GetUserDomainGrant       `pulumi:"domainGrants"`
	FirewallGrants     []GetUserFirewallGrant     `pulumi:"firewallGrants"`
	ImageGrants        []GetUserImageGrant        `pulumi:"imageGrants"`
	LinodeGrants       []GetUserLinodeGrant       `pulumi:"linodeGrants"`
	LongviewGrants     []GetUserLongviewGrant     `pulumi:"longviewGrants"`
	NodebalancerGrants []GetUserNodebalancerGrant `pulumi:"nodebalancerGrants"`
	StackscriptGrants  []GetUserStackscriptGrant  `pulumi:"stackscriptGrants"`
	// The unique username of this User.
	Username     string               `pulumi:"username"`
	VolumeGrants []GetUserVolumeGrant `pulumi:"volumeGrants"`
}

// A collection of values returned by getUser.
type LookupUserResult struct {
	DatabaseGrants []GetUserDatabaseGrant `pulumi:"databaseGrants"`
	DomainGrants   []GetUserDomainGrant   `pulumi:"domainGrants"`
	// The email address for this User, for account management communications, and may be used for other communications as configured.
	Email          string                 `pulumi:"email"`
	FirewallGrants []GetUserFirewallGrant `pulumi:"firewallGrants"`
	GlobalGrants   []GetUserGlobalGrant   `pulumi:"globalGrants"`
	// The ID of entity this grant applies to.
	Id                 string                     `pulumi:"id"`
	ImageGrants        []GetUserImageGrant        `pulumi:"imageGrants"`
	LinodeGrants       []GetUserLinodeGrant       `pulumi:"linodeGrants"`
	LongviewGrants     []GetUserLongviewGrant     `pulumi:"longviewGrants"`
	NodebalancerGrants []GetUserNodebalancerGrant `pulumi:"nodebalancerGrants"`
	// The date and time when this User’s current password was created. User passwords are first created during the Account sign-up process, and updated using the Reset Password webpage. null if this User has not created a password yet.
	PasswordCreated string `pulumi:"passwordCreated"`
	// If true, this User must be granted access to perform actions or access entities on this Account.
	Restricted bool `pulumi:"restricted"`
	// A list of SSH Key labels added by this User. These are the keys that will be deployed if this User is included in the authorizedUsers field of a create Linode, rebuild Linode, or create Disk request.
	SshKeys           []string                  `pulumi:"sshKeys"`
	StackscriptGrants []GetUserStackscriptGrant `pulumi:"stackscriptGrants"`
	// A boolean value indicating if the User has Two Factor Authentication (TFA) enabled.
	TfaEnabled bool   `pulumi:"tfaEnabled"`
	Username   string `pulumi:"username"`
	// The phone number verified for this User Profile with the Phone Number Verify command. null if this User Profile has no verified phone number.
	VerifiedPhoneNumber string               `pulumi:"verifiedPhoneNumber"`
	VolumeGrants        []GetUserVolumeGrant `pulumi:"volumeGrants"`
}

func LookupUserOutput(ctx *pulumi.Context, args LookupUserOutputArgs, opts ...pulumi.InvokeOption) LookupUserResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupUserResult, error) {
			args := v.(LookupUserArgs)
			r, err := LookupUser(ctx, &args, opts...)
			var s LookupUserResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupUserResultOutput)
}

// A collection of arguments for invoking getUser.
type LookupUserOutputArgs struct {
	DatabaseGrants     GetUserDatabaseGrantArrayInput     `pulumi:"databaseGrants"`
	DomainGrants       GetUserDomainGrantArrayInput       `pulumi:"domainGrants"`
	FirewallGrants     GetUserFirewallGrantArrayInput     `pulumi:"firewallGrants"`
	ImageGrants        GetUserImageGrantArrayInput        `pulumi:"imageGrants"`
	LinodeGrants       GetUserLinodeGrantArrayInput       `pulumi:"linodeGrants"`
	LongviewGrants     GetUserLongviewGrantArrayInput     `pulumi:"longviewGrants"`
	NodebalancerGrants GetUserNodebalancerGrantArrayInput `pulumi:"nodebalancerGrants"`
	StackscriptGrants  GetUserStackscriptGrantArrayInput  `pulumi:"stackscriptGrants"`
	// The unique username of this User.
	Username     pulumi.StringInput           `pulumi:"username"`
	VolumeGrants GetUserVolumeGrantArrayInput `pulumi:"volumeGrants"`
}

func (LookupUserOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupUserArgs)(nil)).Elem()
}

// A collection of values returned by getUser.
type LookupUserResultOutput struct{ *pulumi.OutputState }

func (LookupUserResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupUserResult)(nil)).Elem()
}

func (o LookupUserResultOutput) ToLookupUserResultOutput() LookupUserResultOutput {
	return o
}

func (o LookupUserResultOutput) ToLookupUserResultOutputWithContext(ctx context.Context) LookupUserResultOutput {
	return o
}

func (o LookupUserResultOutput) DatabaseGrants() GetUserDatabaseGrantArrayOutput {
	return o.ApplyT(func(v LookupUserResult) []GetUserDatabaseGrant { return v.DatabaseGrants }).(GetUserDatabaseGrantArrayOutput)
}

func (o LookupUserResultOutput) DomainGrants() GetUserDomainGrantArrayOutput {
	return o.ApplyT(func(v LookupUserResult) []GetUserDomainGrant { return v.DomainGrants }).(GetUserDomainGrantArrayOutput)
}

// The email address for this User, for account management communications, and may be used for other communications as configured.
func (o LookupUserResultOutput) Email() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.Email }).(pulumi.StringOutput)
}

func (o LookupUserResultOutput) FirewallGrants() GetUserFirewallGrantArrayOutput {
	return o.ApplyT(func(v LookupUserResult) []GetUserFirewallGrant { return v.FirewallGrants }).(GetUserFirewallGrantArrayOutput)
}

func (o LookupUserResultOutput) GlobalGrants() GetUserGlobalGrantArrayOutput {
	return o.ApplyT(func(v LookupUserResult) []GetUserGlobalGrant { return v.GlobalGrants }).(GetUserGlobalGrantArrayOutput)
}

// The ID of entity this grant applies to.
func (o LookupUserResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupUserResultOutput) ImageGrants() GetUserImageGrantArrayOutput {
	return o.ApplyT(func(v LookupUserResult) []GetUserImageGrant { return v.ImageGrants }).(GetUserImageGrantArrayOutput)
}

func (o LookupUserResultOutput) LinodeGrants() GetUserLinodeGrantArrayOutput {
	return o.ApplyT(func(v LookupUserResult) []GetUserLinodeGrant { return v.LinodeGrants }).(GetUserLinodeGrantArrayOutput)
}

func (o LookupUserResultOutput) LongviewGrants() GetUserLongviewGrantArrayOutput {
	return o.ApplyT(func(v LookupUserResult) []GetUserLongviewGrant { return v.LongviewGrants }).(GetUserLongviewGrantArrayOutput)
}

func (o LookupUserResultOutput) NodebalancerGrants() GetUserNodebalancerGrantArrayOutput {
	return o.ApplyT(func(v LookupUserResult) []GetUserNodebalancerGrant { return v.NodebalancerGrants }).(GetUserNodebalancerGrantArrayOutput)
}

// The date and time when this User’s current password was created. User passwords are first created during the Account sign-up process, and updated using the Reset Password webpage. null if this User has not created a password yet.
func (o LookupUserResultOutput) PasswordCreated() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.PasswordCreated }).(pulumi.StringOutput)
}

// If true, this User must be granted access to perform actions or access entities on this Account.
func (o LookupUserResultOutput) Restricted() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupUserResult) bool { return v.Restricted }).(pulumi.BoolOutput)
}

// A list of SSH Key labels added by this User. These are the keys that will be deployed if this User is included in the authorizedUsers field of a create Linode, rebuild Linode, or create Disk request.
func (o LookupUserResultOutput) SshKeys() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupUserResult) []string { return v.SshKeys }).(pulumi.StringArrayOutput)
}

func (o LookupUserResultOutput) StackscriptGrants() GetUserStackscriptGrantArrayOutput {
	return o.ApplyT(func(v LookupUserResult) []GetUserStackscriptGrant { return v.StackscriptGrants }).(GetUserStackscriptGrantArrayOutput)
}

// A boolean value indicating if the User has Two Factor Authentication (TFA) enabled.
func (o LookupUserResultOutput) TfaEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupUserResult) bool { return v.TfaEnabled }).(pulumi.BoolOutput)
}

func (o LookupUserResultOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.Username }).(pulumi.StringOutput)
}

// The phone number verified for this User Profile with the Phone Number Verify command. null if this User Profile has no verified phone number.
func (o LookupUserResultOutput) VerifiedPhoneNumber() pulumi.StringOutput {
	return o.ApplyT(func(v LookupUserResult) string { return v.VerifiedPhoneNumber }).(pulumi.StringOutput)
}

func (o LookupUserResultOutput) VolumeGrants() GetUserVolumeGrantArrayOutput {
	return o.ApplyT(func(v LookupUserResult) []GetUserVolumeGrant { return v.VolumeGrants }).(GetUserVolumeGrantArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupUserResultOutput{})
}
