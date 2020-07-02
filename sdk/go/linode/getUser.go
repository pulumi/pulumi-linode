// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
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
// 	"github.com/pulumi/pulumi-linode/sdk/v2/go/linode"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := linode.GetUser(ctx, &linode.GetUserArgs{
// 			Username: "foo",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ## Attributes
//
// The Linode User resource exports the following attributes:
//
// * `sshKeys` - A list of SSH Key labels added by this User. These are the keys that will be deployed if this User is included in the authorizedUsers field of a create Linode, rebuild Linode, or create Disk request.
//
// * `email` - The email address for this User, for account management communications, and may be used for other communications as configured.
//
// * `restricted` - If true, this User must be granted access to perform actions or access entities on this Account.
func GetUser(ctx *pulumi.Context, args *GetUserArgs, opts ...pulumi.InvokeOption) (*GetUserResult, error) {
	var rv GetUserResult
	err := ctx.Invoke("linode:index/getUser:getUser", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getUser.
type GetUserArgs struct {
	// The unique username of this User.
	Username string `pulumi:"username"`
}

// A collection of values returned by getUser.
type GetUserResult struct {
	Email string `pulumi:"email"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Restricted bool     `pulumi:"restricted"`
	SshKeys    []string `pulumi:"sshKeys"`
	Username   string   `pulumi:"username"`
}
