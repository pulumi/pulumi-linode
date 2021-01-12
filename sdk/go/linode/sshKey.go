// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Linode SSH Key resource.  This can be used to create, modify, and delete Linodes SSH Keys.  Managed SSH Keys allow instances to be created with a list of Linode usernames, whose SSH keys will be automatically applied to the root account's `~/.ssh/authorized_keys` file.
// For more information, see the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/getSSHKeys).
//
// ## Attributes
//
// This resource exports the following attributes:
//
// * `created` - The date this SSH Key was created.
//
// ## Import
//
// Linodes SSH Keys can be imported using the Linode SSH Key `id`, e.g.
//
// ```sh
//  $ pulumi import linode:index/sshKey:SshKey mysshkey 1234567
// ```
type SshKey struct {
	pulumi.CustomResourceState

	// The date this key was added.
	Created pulumi.StringOutput `pulumi:"created"`
	// A label for the SSH Key.
	Label pulumi.StringOutput `pulumi:"label"`
	// The public SSH Key, which is used to authenticate to the root user of the Linodes you deploy.
	SshKey pulumi.StringOutput `pulumi:"sshKey"`
}

// NewSshKey registers a new resource with the given unique name, arguments, and options.
func NewSshKey(ctx *pulumi.Context,
	name string, args *SshKeyArgs, opts ...pulumi.ResourceOption) (*SshKey, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Label == nil {
		return nil, errors.New("invalid value for required argument 'Label'")
	}
	if args.SshKey == nil {
		return nil, errors.New("invalid value for required argument 'SshKey'")
	}
	var resource SshKey
	err := ctx.RegisterResource("linode:index/sshKey:SshKey", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSshKey gets an existing SshKey resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSshKey(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SshKeyState, opts ...pulumi.ResourceOption) (*SshKey, error) {
	var resource SshKey
	err := ctx.ReadResource("linode:index/sshKey:SshKey", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SshKey resources.
type sshKeyState struct {
	// The date this key was added.
	Created *string `pulumi:"created"`
	// A label for the SSH Key.
	Label *string `pulumi:"label"`
	// The public SSH Key, which is used to authenticate to the root user of the Linodes you deploy.
	SshKey *string `pulumi:"sshKey"`
}

type SshKeyState struct {
	// The date this key was added.
	Created pulumi.StringPtrInput
	// A label for the SSH Key.
	Label pulumi.StringPtrInput
	// The public SSH Key, which is used to authenticate to the root user of the Linodes you deploy.
	SshKey pulumi.StringPtrInput
}

func (SshKeyState) ElementType() reflect.Type {
	return reflect.TypeOf((*sshKeyState)(nil)).Elem()
}

type sshKeyArgs struct {
	// A label for the SSH Key.
	Label string `pulumi:"label"`
	// The public SSH Key, which is used to authenticate to the root user of the Linodes you deploy.
	SshKey string `pulumi:"sshKey"`
}

// The set of arguments for constructing a SshKey resource.
type SshKeyArgs struct {
	// A label for the SSH Key.
	Label pulumi.StringInput
	// The public SSH Key, which is used to authenticate to the root user of the Linodes you deploy.
	SshKey pulumi.StringInput
}

func (SshKeyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sshKeyArgs)(nil)).Elem()
}

type SshKeyInput interface {
	pulumi.Input

	ToSshKeyOutput() SshKeyOutput
	ToSshKeyOutputWithContext(ctx context.Context) SshKeyOutput
}

func (SshKey) ElementType() reflect.Type {
	return reflect.TypeOf((*SshKey)(nil)).Elem()
}

func (i SshKey) ToSshKeyOutput() SshKeyOutput {
	return i.ToSshKeyOutputWithContext(context.Background())
}

func (i SshKey) ToSshKeyOutputWithContext(ctx context.Context) SshKeyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SshKeyOutput)
}

type SshKeyOutput struct {
	*pulumi.OutputState
}

func (SshKeyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*SshKeyOutput)(nil)).Elem()
}

func (o SshKeyOutput) ToSshKeyOutput() SshKeyOutput {
	return o
}

func (o SshKeyOutput) ToSshKeyOutputWithContext(ctx context.Context) SshKeyOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(SshKeyOutput{})
}
