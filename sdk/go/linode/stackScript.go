// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Linode StackScript resource.  This can be used to create, modify, and delete Linode StackScripts.  StackScripts are private or public managed scripts which run within an instance during startup.  StackScripts can include variables whose values are specified when the Instance is created.
//
// For more information, see [Automate Deployment with StackScripts](https://www.linode.com/docs/platform/stackscripts/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#tag/StackScripts).
//
// ## Example Usage
//
// The following example shows how one might use this resource to configure a StackScript attached to a Linode Instance.  As shown below, StackScripts must begin with a shebang (`#!/`).  The `<UDF ...>` element provided in the Bash comment block defines a variable whose value is provided when creating the Instance (or disk) using the `stackscriptData` field.
//
// ```go
// package main
//
// import (
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-linode/sdk/v3/go/linode"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		fooStackScript, err := linode.NewStackScript(ctx, "fooStackScript", &linode.StackScriptArgs{
// 			Label:       pulumi.String("foo"),
// 			Description: pulumi.String("Installs a Package"),
// 			Script:      pulumi.String(fmt.Sprintf("%v%v%v%v%v", "#!/bin/bash\n", "# <UDF name=\"package\" label=\"System Package to Install\" example=\"nginx\" default=\"\">\n", "apt-get -q update && apt-get -q -y install ", "$", "PACKAGE\n")),
// 			Images: pulumi.StringArray{
// 				pulumi.String("linode/ubuntu18.04"),
// 				pulumi.String("linode/ubuntu16.04lts"),
// 			},
// 			RevNote: pulumi.String("initial version"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = linode.NewInstance(ctx, "fooInstance", &linode.InstanceArgs{
// 			Image:  pulumi.String("linode/ubuntu18.04"),
// 			Label:  pulumi.String("foo"),
// 			Region: pulumi.String("us-east"),
// 			Type:   pulumi.String("g6-nanode-1"),
// 			AuthorizedKeys: pulumi.StringArray{
// 				pulumi.String("..."),
// 			},
// 			RootPass:      pulumi.String("..."),
// 			StackscriptId: fooStackScript.ID(),
// 			StackscriptData: pulumi.AnyMap{
// 				"package": pulumi.Any("nginx"),
// 			},
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
// * `deploymentsActive` - Count of currently active, deployed Linodes created from this StackScript.
//
// * `userGravatarId` - The Gravatar ID for the User who created the StackScript.
//
// * `deploymentsTotal` - The total number of times this StackScript has been deployed.
//
// * `username` - The User who created the StackScript.
//
// * `created` - The date this StackScript was created.
//
// * `updated` - The date this StackScript was updated.
//
// * `userDefinedFields` - This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized parameters during deployment.
//
//   * `label` - A human-readable label for the field that will serve as the input prompt for entering the value during deployment.
//
//   * `name` - The name of the field.
//
//   * `example` - An example value for the field.
//
//   * `oneOf` - A list of acceptable single values for the field.
//
//   * `manyOf` - A list of acceptable values for the field in any quantity, combination or order.
//
//   * `default` - The default value. If not specified, this value will be used.
//
// ## Import
//
// Linodes StackScripts can be imported using the Linode StackScript `id`, e.g.
//
// ```sh
//  $ pulumi import linode:index/stackScript:StackScript mystackscript 1234567
// ```
type StackScript struct {
	pulumi.CustomResourceState

	// The date this StackScript was created.
	Created pulumi.StringOutput `pulumi:"created"`
	// Count of currently active, deployed Linodes created from this StackScript.
	DeploymentsActive pulumi.IntOutput `pulumi:"deploymentsActive"`
	// The total number of times this StackScript has been deployed.
	DeploymentsTotal pulumi.IntOutput `pulumi:"deploymentsTotal"`
	// A description for the StackScript.
	Description pulumi.StringOutput `pulumi:"description"`
	// An array of Image IDs representing the Images that this StackScript is compatible for deploying with.
	Images pulumi.StringArrayOutput `pulumi:"images"`
	// This determines whether other users can use your StackScript. Once a StackScript is made public, it cannot be made private. *Changing `isPublic` forces the creation of a new StackScript*
	IsPublic pulumi.BoolPtrOutput `pulumi:"isPublic"`
	// The StackScript's label is for display purposes only.
	Label pulumi.StringOutput `pulumi:"label"`
	// This field allows you to add notes for the set of revisions made to this StackScript.
	RevNote pulumi.StringPtrOutput `pulumi:"revNote"`
	// The script to execute when provisioning a new Linode with this StackScript.
	Script pulumi.StringOutput `pulumi:"script"`
	// The date this StackScript was updated.
	Updated pulumi.StringOutput `pulumi:"updated"`
	// This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized
	// parameters during deployment.
	UserDefinedFields StackScriptUserDefinedFieldArrayOutput `pulumi:"userDefinedFields"`
	// The Gravatar ID for the User who created the StackScript.
	UserGravatarId pulumi.StringOutput `pulumi:"userGravatarId"`
	// The User who created the StackScript.
	Username pulumi.StringOutput `pulumi:"username"`
}

// NewStackScript registers a new resource with the given unique name, arguments, and options.
func NewStackScript(ctx *pulumi.Context,
	name string, args *StackScriptArgs, opts ...pulumi.ResourceOption) (*StackScript, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Description == nil {
		return nil, errors.New("invalid value for required argument 'Description'")
	}
	if args.Images == nil {
		return nil, errors.New("invalid value for required argument 'Images'")
	}
	if args.Label == nil {
		return nil, errors.New("invalid value for required argument 'Label'")
	}
	if args.Script == nil {
		return nil, errors.New("invalid value for required argument 'Script'")
	}
	var resource StackScript
	err := ctx.RegisterResource("linode:index/stackScript:StackScript", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetStackScript gets an existing StackScript resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetStackScript(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *StackScriptState, opts ...pulumi.ResourceOption) (*StackScript, error) {
	var resource StackScript
	err := ctx.ReadResource("linode:index/stackScript:StackScript", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering StackScript resources.
type stackScriptState struct {
	// The date this StackScript was created.
	Created *string `pulumi:"created"`
	// Count of currently active, deployed Linodes created from this StackScript.
	DeploymentsActive *int `pulumi:"deploymentsActive"`
	// The total number of times this StackScript has been deployed.
	DeploymentsTotal *int `pulumi:"deploymentsTotal"`
	// A description for the StackScript.
	Description *string `pulumi:"description"`
	// An array of Image IDs representing the Images that this StackScript is compatible for deploying with.
	Images []string `pulumi:"images"`
	// This determines whether other users can use your StackScript. Once a StackScript is made public, it cannot be made private. *Changing `isPublic` forces the creation of a new StackScript*
	IsPublic *bool `pulumi:"isPublic"`
	// The StackScript's label is for display purposes only.
	Label *string `pulumi:"label"`
	// This field allows you to add notes for the set of revisions made to this StackScript.
	RevNote *string `pulumi:"revNote"`
	// The script to execute when provisioning a new Linode with this StackScript.
	Script *string `pulumi:"script"`
	// The date this StackScript was updated.
	Updated *string `pulumi:"updated"`
	// This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized
	// parameters during deployment.
	UserDefinedFields []StackScriptUserDefinedField `pulumi:"userDefinedFields"`
	// The Gravatar ID for the User who created the StackScript.
	UserGravatarId *string `pulumi:"userGravatarId"`
	// The User who created the StackScript.
	Username *string `pulumi:"username"`
}

type StackScriptState struct {
	// The date this StackScript was created.
	Created pulumi.StringPtrInput
	// Count of currently active, deployed Linodes created from this StackScript.
	DeploymentsActive pulumi.IntPtrInput
	// The total number of times this StackScript has been deployed.
	DeploymentsTotal pulumi.IntPtrInput
	// A description for the StackScript.
	Description pulumi.StringPtrInput
	// An array of Image IDs representing the Images that this StackScript is compatible for deploying with.
	Images pulumi.StringArrayInput
	// This determines whether other users can use your StackScript. Once a StackScript is made public, it cannot be made private. *Changing `isPublic` forces the creation of a new StackScript*
	IsPublic pulumi.BoolPtrInput
	// The StackScript's label is for display purposes only.
	Label pulumi.StringPtrInput
	// This field allows you to add notes for the set of revisions made to this StackScript.
	RevNote pulumi.StringPtrInput
	// The script to execute when provisioning a new Linode with this StackScript.
	Script pulumi.StringPtrInput
	// The date this StackScript was updated.
	Updated pulumi.StringPtrInput
	// This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized
	// parameters during deployment.
	UserDefinedFields StackScriptUserDefinedFieldArrayInput
	// The Gravatar ID for the User who created the StackScript.
	UserGravatarId pulumi.StringPtrInput
	// The User who created the StackScript.
	Username pulumi.StringPtrInput
}

func (StackScriptState) ElementType() reflect.Type {
	return reflect.TypeOf((*stackScriptState)(nil)).Elem()
}

type stackScriptArgs struct {
	// A description for the StackScript.
	Description string `pulumi:"description"`
	// An array of Image IDs representing the Images that this StackScript is compatible for deploying with.
	Images []string `pulumi:"images"`
	// This determines whether other users can use your StackScript. Once a StackScript is made public, it cannot be made private. *Changing `isPublic` forces the creation of a new StackScript*
	IsPublic *bool `pulumi:"isPublic"`
	// The StackScript's label is for display purposes only.
	Label string `pulumi:"label"`
	// This field allows you to add notes for the set of revisions made to this StackScript.
	RevNote *string `pulumi:"revNote"`
	// The script to execute when provisioning a new Linode with this StackScript.
	Script string `pulumi:"script"`
	// This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized
	// parameters during deployment.
	UserDefinedFields []StackScriptUserDefinedField `pulumi:"userDefinedFields"`
}

// The set of arguments for constructing a StackScript resource.
type StackScriptArgs struct {
	// A description for the StackScript.
	Description pulumi.StringInput
	// An array of Image IDs representing the Images that this StackScript is compatible for deploying with.
	Images pulumi.StringArrayInput
	// This determines whether other users can use your StackScript. Once a StackScript is made public, it cannot be made private. *Changing `isPublic` forces the creation of a new StackScript*
	IsPublic pulumi.BoolPtrInput
	// The StackScript's label is for display purposes only.
	Label pulumi.StringInput
	// This field allows you to add notes for the set of revisions made to this StackScript.
	RevNote pulumi.StringPtrInput
	// The script to execute when provisioning a new Linode with this StackScript.
	Script pulumi.StringInput
	// This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized
	// parameters during deployment.
	UserDefinedFields StackScriptUserDefinedFieldArrayInput
}

func (StackScriptArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*stackScriptArgs)(nil)).Elem()
}

type StackScriptInput interface {
	pulumi.Input

	ToStackScriptOutput() StackScriptOutput
	ToStackScriptOutputWithContext(ctx context.Context) StackScriptOutput
}

func (*StackScript) ElementType() reflect.Type {
	return reflect.TypeOf((*StackScript)(nil))
}

func (i *StackScript) ToStackScriptOutput() StackScriptOutput {
	return i.ToStackScriptOutputWithContext(context.Background())
}

func (i *StackScript) ToStackScriptOutputWithContext(ctx context.Context) StackScriptOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StackScriptOutput)
}

func (i *StackScript) ToStackScriptPtrOutput() StackScriptPtrOutput {
	return i.ToStackScriptPtrOutputWithContext(context.Background())
}

func (i *StackScript) ToStackScriptPtrOutputWithContext(ctx context.Context) StackScriptPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StackScriptPtrOutput)
}

type StackScriptPtrInput interface {
	pulumi.Input

	ToStackScriptPtrOutput() StackScriptPtrOutput
	ToStackScriptPtrOutputWithContext(ctx context.Context) StackScriptPtrOutput
}

type stackScriptPtrType StackScriptArgs

func (*stackScriptPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**StackScript)(nil))
}

func (i *stackScriptPtrType) ToStackScriptPtrOutput() StackScriptPtrOutput {
	return i.ToStackScriptPtrOutputWithContext(context.Background())
}

func (i *stackScriptPtrType) ToStackScriptPtrOutputWithContext(ctx context.Context) StackScriptPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StackScriptPtrOutput)
}

// StackScriptArrayInput is an input type that accepts StackScriptArray and StackScriptArrayOutput values.
// You can construct a concrete instance of `StackScriptArrayInput` via:
//
//          StackScriptArray{ StackScriptArgs{...} }
type StackScriptArrayInput interface {
	pulumi.Input

	ToStackScriptArrayOutput() StackScriptArrayOutput
	ToStackScriptArrayOutputWithContext(context.Context) StackScriptArrayOutput
}

type StackScriptArray []StackScriptInput

func (StackScriptArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StackScript)(nil)).Elem()
}

func (i StackScriptArray) ToStackScriptArrayOutput() StackScriptArrayOutput {
	return i.ToStackScriptArrayOutputWithContext(context.Background())
}

func (i StackScriptArray) ToStackScriptArrayOutputWithContext(ctx context.Context) StackScriptArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StackScriptArrayOutput)
}

// StackScriptMapInput is an input type that accepts StackScriptMap and StackScriptMapOutput values.
// You can construct a concrete instance of `StackScriptMapInput` via:
//
//          StackScriptMap{ "key": StackScriptArgs{...} }
type StackScriptMapInput interface {
	pulumi.Input

	ToStackScriptMapOutput() StackScriptMapOutput
	ToStackScriptMapOutputWithContext(context.Context) StackScriptMapOutput
}

type StackScriptMap map[string]StackScriptInput

func (StackScriptMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StackScript)(nil)).Elem()
}

func (i StackScriptMap) ToStackScriptMapOutput() StackScriptMapOutput {
	return i.ToStackScriptMapOutputWithContext(context.Background())
}

func (i StackScriptMap) ToStackScriptMapOutputWithContext(ctx context.Context) StackScriptMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StackScriptMapOutput)
}

type StackScriptOutput struct{ *pulumi.OutputState }

func (StackScriptOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*StackScript)(nil))
}

func (o StackScriptOutput) ToStackScriptOutput() StackScriptOutput {
	return o
}

func (o StackScriptOutput) ToStackScriptOutputWithContext(ctx context.Context) StackScriptOutput {
	return o
}

func (o StackScriptOutput) ToStackScriptPtrOutput() StackScriptPtrOutput {
	return o.ToStackScriptPtrOutputWithContext(context.Background())
}

func (o StackScriptOutput) ToStackScriptPtrOutputWithContext(ctx context.Context) StackScriptPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v StackScript) *StackScript {
		return &v
	}).(StackScriptPtrOutput)
}

type StackScriptPtrOutput struct{ *pulumi.OutputState }

func (StackScriptPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**StackScript)(nil))
}

func (o StackScriptPtrOutput) ToStackScriptPtrOutput() StackScriptPtrOutput {
	return o
}

func (o StackScriptPtrOutput) ToStackScriptPtrOutputWithContext(ctx context.Context) StackScriptPtrOutput {
	return o
}

func (o StackScriptPtrOutput) Elem() StackScriptOutput {
	return o.ApplyT(func(v *StackScript) StackScript {
		if v != nil {
			return *v
		}
		var ret StackScript
		return ret
	}).(StackScriptOutput)
}

type StackScriptArrayOutput struct{ *pulumi.OutputState }

func (StackScriptArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]StackScript)(nil))
}

func (o StackScriptArrayOutput) ToStackScriptArrayOutput() StackScriptArrayOutput {
	return o
}

func (o StackScriptArrayOutput) ToStackScriptArrayOutputWithContext(ctx context.Context) StackScriptArrayOutput {
	return o
}

func (o StackScriptArrayOutput) Index(i pulumi.IntInput) StackScriptOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) StackScript {
		return vs[0].([]StackScript)[vs[1].(int)]
	}).(StackScriptOutput)
}

type StackScriptMapOutput struct{ *pulumi.OutputState }

func (StackScriptMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]StackScript)(nil))
}

func (o StackScriptMapOutput) ToStackScriptMapOutput() StackScriptMapOutput {
	return o
}

func (o StackScriptMapOutput) ToStackScriptMapOutputWithContext(ctx context.Context) StackScriptMapOutput {
	return o
}

func (o StackScriptMapOutput) MapIndex(k pulumi.StringInput) StackScriptOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) StackScript {
		return vs[0].(map[string]StackScript)[vs[1].(string)]
	}).(StackScriptOutput)
}

func init() {
	pulumi.RegisterOutputType(StackScriptOutput{})
	pulumi.RegisterOutputType(StackScriptPtrOutput{})
	pulumi.RegisterOutputType(StackScriptArrayOutput{})
	pulumi.RegisterOutputType(StackScriptMapOutput{})
}
