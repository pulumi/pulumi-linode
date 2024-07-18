// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `SshKey` provides access to a specifically labeled SSH Key in the Profile of the User identified by the access token.
// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-ssh-key).
//
// ## Example Usage
//
// The following example shows how the resource might be used to obtain the name of the SSH Key configured on the Linode user profile.
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
//			_, err := linode.LookupSshKey(ctx, &linode.LookupSshKeyArgs{
//				Label: "foo",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupSshKey(ctx *pulumi.Context, args *LookupSshKeyArgs, opts ...pulumi.InvokeOption) (*LookupSshKeyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSshKeyResult
	err := ctx.Invoke("linode:index/getSshKey:getSshKey", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSshKey.
type LookupSshKeyArgs struct {
	// The ID of the SSH Key
	Id *string `pulumi:"id"`
	// The label of the SSH Key to select.
	Label string `pulumi:"label"`
}

// A collection of values returned by getSshKey.
type LookupSshKeyResult struct {
	// The date this key was added.
	Created string `pulumi:"created"`
	// The ID of the SSH Key
	Id    *string `pulumi:"id"`
	Label string  `pulumi:"label"`
	// The public SSH Key, which is used to authenticate to the root user of the Linodes you deploy.
	SshKey string `pulumi:"sshKey"`
}

func LookupSshKeyOutput(ctx *pulumi.Context, args LookupSshKeyOutputArgs, opts ...pulumi.InvokeOption) LookupSshKeyResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSshKeyResult, error) {
			args := v.(LookupSshKeyArgs)
			r, err := LookupSshKey(ctx, &args, opts...)
			var s LookupSshKeyResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupSshKeyResultOutput)
}

// A collection of arguments for invoking getSshKey.
type LookupSshKeyOutputArgs struct {
	// The ID of the SSH Key
	Id pulumi.StringPtrInput `pulumi:"id"`
	// The label of the SSH Key to select.
	Label pulumi.StringInput `pulumi:"label"`
}

func (LookupSshKeyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSshKeyArgs)(nil)).Elem()
}

// A collection of values returned by getSshKey.
type LookupSshKeyResultOutput struct{ *pulumi.OutputState }

func (LookupSshKeyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSshKeyResult)(nil)).Elem()
}

func (o LookupSshKeyResultOutput) ToLookupSshKeyResultOutput() LookupSshKeyResultOutput {
	return o
}

func (o LookupSshKeyResultOutput) ToLookupSshKeyResultOutputWithContext(ctx context.Context) LookupSshKeyResultOutput {
	return o
}

// The date this key was added.
func (o LookupSshKeyResultOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSshKeyResult) string { return v.Created }).(pulumi.StringOutput)
}

// The ID of the SSH Key
func (o LookupSshKeyResultOutput) Id() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSshKeyResult) *string { return v.Id }).(pulumi.StringPtrOutput)
}

func (o LookupSshKeyResultOutput) Label() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSshKeyResult) string { return v.Label }).(pulumi.StringOutput)
}

// The public SSH Key, which is used to authenticate to the root user of the Linodes you deploy.
func (o LookupSshKeyResultOutput) SshKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSshKeyResult) string { return v.SshKey }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSshKeyResultOutput{})
}
