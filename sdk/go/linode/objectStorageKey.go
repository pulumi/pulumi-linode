// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
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
//
//	"github.com/pulumi/pulumi-linode/sdk/v3/go/linode"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := linode.NewObjectStorageKey(ctx, "foo", &linode.ObjectStorageKeyArgs{
//				Label: pulumi.String("image-access"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
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
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Label == nil {
		return nil, errors.New("invalid value for required argument 'Label'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"secretKey",
	})
	opts = append(opts, secrets)
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

func (*ObjectStorageKey) ElementType() reflect.Type {
	return reflect.TypeOf((**ObjectStorageKey)(nil)).Elem()
}

func (i *ObjectStorageKey) ToObjectStorageKeyOutput() ObjectStorageKeyOutput {
	return i.ToObjectStorageKeyOutputWithContext(context.Background())
}

func (i *ObjectStorageKey) ToObjectStorageKeyOutputWithContext(ctx context.Context) ObjectStorageKeyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ObjectStorageKeyOutput)
}

// ObjectStorageKeyArrayInput is an input type that accepts ObjectStorageKeyArray and ObjectStorageKeyArrayOutput values.
// You can construct a concrete instance of `ObjectStorageKeyArrayInput` via:
//
//	ObjectStorageKeyArray{ ObjectStorageKeyArgs{...} }
type ObjectStorageKeyArrayInput interface {
	pulumi.Input

	ToObjectStorageKeyArrayOutput() ObjectStorageKeyArrayOutput
	ToObjectStorageKeyArrayOutputWithContext(context.Context) ObjectStorageKeyArrayOutput
}

type ObjectStorageKeyArray []ObjectStorageKeyInput

func (ObjectStorageKeyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ObjectStorageKey)(nil)).Elem()
}

func (i ObjectStorageKeyArray) ToObjectStorageKeyArrayOutput() ObjectStorageKeyArrayOutput {
	return i.ToObjectStorageKeyArrayOutputWithContext(context.Background())
}

func (i ObjectStorageKeyArray) ToObjectStorageKeyArrayOutputWithContext(ctx context.Context) ObjectStorageKeyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ObjectStorageKeyArrayOutput)
}

// ObjectStorageKeyMapInput is an input type that accepts ObjectStorageKeyMap and ObjectStorageKeyMapOutput values.
// You can construct a concrete instance of `ObjectStorageKeyMapInput` via:
//
//	ObjectStorageKeyMap{ "key": ObjectStorageKeyArgs{...} }
type ObjectStorageKeyMapInput interface {
	pulumi.Input

	ToObjectStorageKeyMapOutput() ObjectStorageKeyMapOutput
	ToObjectStorageKeyMapOutputWithContext(context.Context) ObjectStorageKeyMapOutput
}

type ObjectStorageKeyMap map[string]ObjectStorageKeyInput

func (ObjectStorageKeyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ObjectStorageKey)(nil)).Elem()
}

func (i ObjectStorageKeyMap) ToObjectStorageKeyMapOutput() ObjectStorageKeyMapOutput {
	return i.ToObjectStorageKeyMapOutputWithContext(context.Background())
}

func (i ObjectStorageKeyMap) ToObjectStorageKeyMapOutputWithContext(ctx context.Context) ObjectStorageKeyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ObjectStorageKeyMapOutput)
}

type ObjectStorageKeyOutput struct{ *pulumi.OutputState }

func (ObjectStorageKeyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ObjectStorageKey)(nil)).Elem()
}

func (o ObjectStorageKeyOutput) ToObjectStorageKeyOutput() ObjectStorageKeyOutput {
	return o
}

func (o ObjectStorageKeyOutput) ToObjectStorageKeyOutputWithContext(ctx context.Context) ObjectStorageKeyOutput {
	return o
}

// This keypair's access key. This is not secret.
func (o ObjectStorageKeyOutput) AccessKey() pulumi.StringOutput {
	return o.ApplyT(func(v *ObjectStorageKey) pulumi.StringOutput { return v.AccessKey }).(pulumi.StringOutput)
}

// Defines this key as a Limited Access Key. Limited Access Keys restrict this Object Storage key’s access to only the bucket(s) declared in this array and define their bucket-level permissions. Not providing this block will not limit this Object Storage Key.
func (o ObjectStorageKeyOutput) BucketAccesses() ObjectStorageKeyBucketAccessArrayOutput {
	return o.ApplyT(func(v *ObjectStorageKey) ObjectStorageKeyBucketAccessArrayOutput { return v.BucketAccesses }).(ObjectStorageKeyBucketAccessArrayOutput)
}

// The label given to this key. For display purposes only.
func (o ObjectStorageKeyOutput) Label() pulumi.StringOutput {
	return o.ApplyT(func(v *ObjectStorageKey) pulumi.StringOutput { return v.Label }).(pulumi.StringOutput)
}

// Whether or not this key is a limited access key.
func (o ObjectStorageKeyOutput) Limited() pulumi.BoolOutput {
	return o.ApplyT(func(v *ObjectStorageKey) pulumi.BoolOutput { return v.Limited }).(pulumi.BoolOutput)
}

// This keypair's secret key.
func (o ObjectStorageKeyOutput) SecretKey() pulumi.StringOutput {
	return o.ApplyT(func(v *ObjectStorageKey) pulumi.StringOutput { return v.SecretKey }).(pulumi.StringOutput)
}

type ObjectStorageKeyArrayOutput struct{ *pulumi.OutputState }

func (ObjectStorageKeyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ObjectStorageKey)(nil)).Elem()
}

func (o ObjectStorageKeyArrayOutput) ToObjectStorageKeyArrayOutput() ObjectStorageKeyArrayOutput {
	return o
}

func (o ObjectStorageKeyArrayOutput) ToObjectStorageKeyArrayOutputWithContext(ctx context.Context) ObjectStorageKeyArrayOutput {
	return o
}

func (o ObjectStorageKeyArrayOutput) Index(i pulumi.IntInput) ObjectStorageKeyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ObjectStorageKey {
		return vs[0].([]*ObjectStorageKey)[vs[1].(int)]
	}).(ObjectStorageKeyOutput)
}

type ObjectStorageKeyMapOutput struct{ *pulumi.OutputState }

func (ObjectStorageKeyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ObjectStorageKey)(nil)).Elem()
}

func (o ObjectStorageKeyMapOutput) ToObjectStorageKeyMapOutput() ObjectStorageKeyMapOutput {
	return o
}

func (o ObjectStorageKeyMapOutput) ToObjectStorageKeyMapOutputWithContext(ctx context.Context) ObjectStorageKeyMapOutput {
	return o
}

func (o ObjectStorageKeyMapOutput) MapIndex(k pulumi.StringInput) ObjectStorageKeyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ObjectStorageKey {
		return vs[0].(map[string]*ObjectStorageKey)[vs[1].(string)]
	}).(ObjectStorageKeyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ObjectStorageKeyInput)(nil)).Elem(), &ObjectStorageKey{})
	pulumi.RegisterInputType(reflect.TypeOf((*ObjectStorageKeyArrayInput)(nil)).Elem(), ObjectStorageKeyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ObjectStorageKeyMapInput)(nil)).Elem(), ObjectStorageKeyMap{})
	pulumi.RegisterOutputType(ObjectStorageKeyOutput{})
	pulumi.RegisterOutputType(ObjectStorageKeyArrayOutput{})
	pulumi.RegisterOutputType(ObjectStorageKeyMapOutput{})
}
