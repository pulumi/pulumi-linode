// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

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
	if args == nil || args.Description == nil {
		return nil, errors.New("missing required argument 'Description'")
	}
	if args == nil || args.Images == nil {
		return nil, errors.New("missing required argument 'Images'")
	}
	if args == nil || args.Label == nil {
		return nil, errors.New("missing required argument 'Label'")
	}
	if args == nil || args.Script == nil {
		return nil, errors.New("missing required argument 'Script'")
	}
	if args == nil {
		args = &StackScriptArgs{}
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
