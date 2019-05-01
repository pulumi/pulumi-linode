// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a Linode StackScript resource.  This can be used to create, modify, and delete Linode StackScripts.  StackScripts are private or public managed scripts which run within an instance during startup.  StackScripts can include variables whose values are specified when the Instance is created.  
// 
// For more information, see [Automate Deployment with StackScripts](https://www.linode.com/docs/platform/stackscripts/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#tag/StackScripts).
// 
// The Linode Guide, [Deploy a WordPress Site Using Terraform and Linode StackScripts](https://www.linode.com/docs/applications/configuration-management/deploy-a-wordpress-site-using-terraform-and-linode-stackscripts/), shows how a public StackScript can be used to provision a Linode Instance.   The guide, [Create a Terraform Module](https://www.linode.com/docs/applications/configuration-management/create-terraform-module/), demonstrates StackScript use through a wrapping module.
// 
// ## Attributes
// 
// This resource exports the following attributes:
// 
// * `deployments_active` - Count of currently active, deployed Linodes created from this StackScript.
// 
// * `user_gravatar_id` - The Gravatar ID for the User who created the StackScript.
// 
// * `deployments_total` - The total number of times this StackScript has been deployed.
// 
// * `username` - The User who created the StackScript.
// 
// * `created` - The date this StackScript was created.
// 
// * `updated` - The date this StackScript was updated.
// 
// * `user_defined_fields` - This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized parameters during deployment.
// 
//   * `label` - A human-readable label for the field that will serve as the input prompt for entering the value during deployment.
// 
//   * `name` - The name of the field.
// 
//   * `example` - An example value for the field.
// 
//   * `one_of` - A list of acceptable single values for the field.
// 
//   * `many_of` - A list of acceptable values for the field in any quantity, combination or order.
// 
//   * `default` - The default value. If not specified, this value will be used.
type StackScript struct {
	s *pulumi.ResourceState
}

// NewStackScript registers a new resource with the given unique name, arguments, and options.
func NewStackScript(ctx *pulumi.Context,
	name string, args *StackScriptArgs, opts ...pulumi.ResourceOpt) (*StackScript, error) {
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
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["description"] = nil
		inputs["images"] = nil
		inputs["isPublic"] = nil
		inputs["label"] = nil
		inputs["revNote"] = nil
		inputs["script"] = nil
	} else {
		inputs["description"] = args.Description
		inputs["images"] = args.Images
		inputs["isPublic"] = args.IsPublic
		inputs["label"] = args.Label
		inputs["revNote"] = args.RevNote
		inputs["script"] = args.Script
	}
	inputs["created"] = nil
	inputs["deploymentsActive"] = nil
	inputs["deploymentsTotal"] = nil
	inputs["updated"] = nil
	inputs["userDefinedFields"] = nil
	inputs["userGravatarId"] = nil
	inputs["username"] = nil
	s, err := ctx.RegisterResource("linode:index/stackScript:StackScript", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &StackScript{s: s}, nil
}

// GetStackScript gets an existing StackScript resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetStackScript(ctx *pulumi.Context,
	name string, id pulumi.ID, state *StackScriptState, opts ...pulumi.ResourceOpt) (*StackScript, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["created"] = state.Created
		inputs["deploymentsActive"] = state.DeploymentsActive
		inputs["deploymentsTotal"] = state.DeploymentsTotal
		inputs["description"] = state.Description
		inputs["images"] = state.Images
		inputs["isPublic"] = state.IsPublic
		inputs["label"] = state.Label
		inputs["revNote"] = state.RevNote
		inputs["script"] = state.Script
		inputs["updated"] = state.Updated
		inputs["userDefinedFields"] = state.UserDefinedFields
		inputs["userGravatarId"] = state.UserGravatarId
		inputs["username"] = state.Username
	}
	s, err := ctx.ReadResource("linode:index/stackScript:StackScript", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &StackScript{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *StackScript) URN() *pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *StackScript) ID() *pulumi.IDOutput {
	return r.s.ID()
}

// The date this StackScript was created.
func (r *StackScript) Created() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["created"])
}

// Count of currently active, deployed Linodes created from this StackScript.
func (r *StackScript) DeploymentsActive() *pulumi.IntOutput {
	return (*pulumi.IntOutput)(r.s.State["deploymentsActive"])
}

// The total number of times this StackScript has been deployed.
func (r *StackScript) DeploymentsTotal() *pulumi.IntOutput {
	return (*pulumi.IntOutput)(r.s.State["deploymentsTotal"])
}

// A description for the StackScript.
func (r *StackScript) Description() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["description"])
}

// An array of Image IDs representing the Images that this StackScript is compatible for deploying with.
func (r *StackScript) Images() *pulumi.ArrayOutput {
	return (*pulumi.ArrayOutput)(r.s.State["images"])
}

// This determines whether other users can use your StackScript. Once a StackScript is made public, it cannot be made private. *Changing `is_public` forces the creation of a new StackScript*
func (r *StackScript) IsPublic() *pulumi.BoolOutput {
	return (*pulumi.BoolOutput)(r.s.State["isPublic"])
}

// The StackScript's label is for display purposes only.
func (r *StackScript) Label() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["label"])
}

// This field allows you to add notes for the set of revisions made to this StackScript.
func (r *StackScript) RevNote() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["revNote"])
}

// The script to execute when provisioning a new Linode with this StackScript.
func (r *StackScript) Script() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["script"])
}

// The date this StackScript was updated.
func (r *StackScript) Updated() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["updated"])
}

// This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized
// parameters during deployment.
func (r *StackScript) UserDefinedFields() *pulumi.ArrayOutput {
	return (*pulumi.ArrayOutput)(r.s.State["userDefinedFields"])
}

// The Gravatar ID for the User who created the StackScript.
func (r *StackScript) UserGravatarId() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["userGravatarId"])
}

// The User who created the StackScript.
func (r *StackScript) Username() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["username"])
}

// Input properties used for looking up and filtering StackScript resources.
type StackScriptState struct {
	// The date this StackScript was created.
	Created interface{}
	// Count of currently active, deployed Linodes created from this StackScript.
	DeploymentsActive interface{}
	// The total number of times this StackScript has been deployed.
	DeploymentsTotal interface{}
	// A description for the StackScript.
	Description interface{}
	// An array of Image IDs representing the Images that this StackScript is compatible for deploying with.
	Images interface{}
	// This determines whether other users can use your StackScript. Once a StackScript is made public, it cannot be made private. *Changing `is_public` forces the creation of a new StackScript*
	IsPublic interface{}
	// The StackScript's label is for display purposes only.
	Label interface{}
	// This field allows you to add notes for the set of revisions made to this StackScript.
	RevNote interface{}
	// The script to execute when provisioning a new Linode with this StackScript.
	Script interface{}
	// The date this StackScript was updated.
	Updated interface{}
	// This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized
	// parameters during deployment.
	UserDefinedFields interface{}
	// The Gravatar ID for the User who created the StackScript.
	UserGravatarId interface{}
	// The User who created the StackScript.
	Username interface{}
}

// The set of arguments for constructing a StackScript resource.
type StackScriptArgs struct {
	// A description for the StackScript.
	Description interface{}
	// An array of Image IDs representing the Images that this StackScript is compatible for deploying with.
	Images interface{}
	// This determines whether other users can use your StackScript. Once a StackScript is made public, it cannot be made private. *Changing `is_public` forces the creation of a new StackScript*
	IsPublic interface{}
	// The StackScript's label is for display purposes only.
	Label interface{}
	// This field allows you to add notes for the set of revisions made to this StackScript.
	RevNote interface{}
	// The script to execute when provisioning a new Linode with this StackScript.
	Script interface{}
}
