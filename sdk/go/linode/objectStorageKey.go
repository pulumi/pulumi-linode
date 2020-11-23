// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Linode Object Storage Key resource. This can be used to create, modify, and delete Linodes Object Storage Keys.
//
// ## Example Usage
//
// The following example shows how one might use this resource to create an Object Storage Key.
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
// 		_, err := linode.NewObjectStorageKey(ctx, "foo", &linode.ObjectStorageKeyArgs{
// 			Label: pulumi.String("image-access"),
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
// * `accessKey` - This keypair's access key. This is not secret.
//
// * `secretKey` - This keypair's secret key.
//
// * `limited` - Whether or not this key is a limited access key.
type ObjectStorageKey struct {
	pulumi.CustomResourceState

	// This keypair's access key. This is not secret.
	AccessKey pulumi.StringOutput `pulumi:"accessKey"`
	// Defines this key as a Limited Access Key. Limited Access Keys restrict this Object Storage key’s access to only the bucket(s) declared in this array and define their bucket-level permissions. Not providing this block will not limit this Object Storage Key.
	BucketAccesses ObjectStorageKeyBucketAccessArrayOutput `pulumi:"bucketAccesses"`
	// The label given to this key. For display purposes only.
	Label pulumi.StringOutput `pulumi:"label"`
	// Whether or not this key is a limited access key.
	Limited pulumi.BoolOutput `pulumi:"limited"`
	// This keypair's secret key.
	SecretKey pulumi.StringOutput `pulumi:"secretKey"`
}

// NewObjectStorageKey registers a new resource with the given unique name, arguments, and options.
func NewObjectStorageKey(ctx *pulumi.Context,
	name string, args *ObjectStorageKeyArgs, opts ...pulumi.ResourceOption) (*ObjectStorageKey, error) {
	if args == nil || args.Label == nil {
		return nil, errors.New("missing required argument 'Label'")
	}
	if args == nil {
		args = &ObjectStorageKeyArgs{}
	}
	var resource ObjectStorageKey
	err := ctx.RegisterResource("linode:index/objectStorageKey:ObjectStorageKey", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetObjectStorageKey gets an existing ObjectStorageKey resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetObjectStorageKey(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ObjectStorageKeyState, opts ...pulumi.ResourceOption) (*ObjectStorageKey, error) {
	var resource ObjectStorageKey
	err := ctx.ReadResource("linode:index/objectStorageKey:ObjectStorageKey", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ObjectStorageKey resources.
type objectStorageKeyState struct {
	// This keypair's access key. This is not secret.
	AccessKey *string `pulumi:"accessKey"`
	// Defines this key as a Limited Access Key. Limited Access Keys restrict this Object Storage key’s access to only the bucket(s) declared in this array and define their bucket-level permissions. Not providing this block will not limit this Object Storage Key.
	BucketAccesses []ObjectStorageKeyBucketAccess `pulumi:"bucketAccesses"`
	// The label given to this key. For display purposes only.
	Label *string `pulumi:"label"`
	// Whether or not this key is a limited access key.
	Limited *bool `pulumi:"limited"`
	// This keypair's secret key.
	SecretKey *string `pulumi:"secretKey"`
}

type ObjectStorageKeyState struct {
	// This keypair's access key. This is not secret.
	AccessKey pulumi.StringPtrInput
	// Defines this key as a Limited Access Key. Limited Access Keys restrict this Object Storage key’s access to only the bucket(s) declared in this array and define their bucket-level permissions. Not providing this block will not limit this Object Storage Key.
	BucketAccesses ObjectStorageKeyBucketAccessArrayInput
	// The label given to this key. For display purposes only.
	Label pulumi.StringPtrInput
	// Whether or not this key is a limited access key.
	Limited pulumi.BoolPtrInput
	// This keypair's secret key.
	SecretKey pulumi.StringPtrInput
}

func (ObjectStorageKeyState) ElementType() reflect.Type {
	return reflect.TypeOf((*objectStorageKeyState)(nil)).Elem()
}

type objectStorageKeyArgs struct {
	// Defines this key as a Limited Access Key. Limited Access Keys restrict this Object Storage key’s access to only the bucket(s) declared in this array and define their bucket-level permissions. Not providing this block will not limit this Object Storage Key.
	BucketAccesses []ObjectStorageKeyBucketAccess `pulumi:"bucketAccesses"`
	// The label given to this key. For display purposes only.
	Label string `pulumi:"label"`
}

// The set of arguments for constructing a ObjectStorageKey resource.
type ObjectStorageKeyArgs struct {
	// Defines this key as a Limited Access Key. Limited Access Keys restrict this Object Storage key’s access to only the bucket(s) declared in this array and define their bucket-level permissions. Not providing this block will not limit this Object Storage Key.
	BucketAccesses ObjectStorageKeyBucketAccessArrayInput
	// The label given to this key. For display purposes only.
	Label pulumi.StringInput
}

func (ObjectStorageKeyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*objectStorageKeyArgs)(nil)).Elem()
}

type ObjectStorageKeyInput interface {
	pulumi.Input

	ToObjectStorageKeyOutput() ObjectStorageKeyOutput
	ToObjectStorageKeyOutputWithContext(ctx context.Context) ObjectStorageKeyOutput
}

func (ObjectStorageKey) ElementType() reflect.Type {
	return reflect.TypeOf((*ObjectStorageKey)(nil)).Elem()
}

func (i ObjectStorageKey) ToObjectStorageKeyOutput() ObjectStorageKeyOutput {
	return i.ToObjectStorageKeyOutputWithContext(context.Background())
}

func (i ObjectStorageKey) ToObjectStorageKeyOutputWithContext(ctx context.Context) ObjectStorageKeyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ObjectStorageKeyOutput)
}

type ObjectStorageKeyOutput struct {
	*pulumi.OutputState
}

func (ObjectStorageKeyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ObjectStorageKeyOutput)(nil)).Elem()
}

func (o ObjectStorageKeyOutput) ToObjectStorageKeyOutput() ObjectStorageKeyOutput {
	return o
}

func (o ObjectStorageKeyOutput) ToObjectStorageKeyOutputWithContext(ctx context.Context) ObjectStorageKeyOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(ObjectStorageKeyOutput{})
}
