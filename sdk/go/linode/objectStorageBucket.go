// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a Linode Object Storage Bucket resource. This can be used to create, modify, and delete Linodes Object Storage Buckets.
//
// ## Example Usage
//
// The following example shows how one might use this resource to create an Object Storage Bucket:
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
//			primary, err := linode.GetObjectStorageCluster(ctx, &linode.GetObjectStorageClusterArgs{
//				Id: "us-east-1",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = linode.NewObjectStorageBucket(ctx, "foobar", &linode.ObjectStorageBucketArgs{
//				Cluster: *pulumi.String(primary.Id),
//				Label:   pulumi.String("mybucket"),
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
// Creating an Object Storage Bucket with Lifecycle rules:
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
//			mykey, err := linode.NewObjectStorageKey(ctx, "mykey", &linode.ObjectStorageKeyArgs{
//				Label: pulumi.String("image-access"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = linode.NewObjectStorageBucket(ctx, "mybucket", &linode.ObjectStorageBucketArgs{
//				AccessKey: mykey.AccessKey,
//				SecretKey: mykey.SecretKey,
//				Cluster:   pulumi.String("us-east-1"),
//				Label:     pulumi.String("mybucket"),
//				LifecycleRules: linode.ObjectStorageBucketLifecycleRuleArray{
//					&linode.ObjectStorageBucketLifecycleRuleArgs{
//						Id:                                 pulumi.String("my-rule"),
//						Enabled:                            pulumi.Bool(true),
//						AbortIncompleteMultipartUploadDays: pulumi.Int(5),
//						Expiration: &linode.ObjectStorageBucketLifecycleRuleExpirationArgs{
//							Date: pulumi.String("2021-06-21"),
//						},
//					},
//				},
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
// ## Import
//
// Linodes Object Storage Buckets can be imported using the resource `id` which is made of `cluster:label`, e.g.
//
// ```sh
//
//	$ pulumi import linode:index/objectStorageBucket:ObjectStorageBucket mybucket us-east-1:foobar
//
// ```
type ObjectStorageBucket struct {
	pulumi.CustomResourceState

	// The access key to authenticate with.
	AccessKey pulumi.StringPtrOutput `pulumi:"accessKey"`
	// The Access Control Level of the bucket using a canned ACL string. See all ACL strings [in the Linode API v4 documentation](https://linode.com/docs/api/object-storage/#object-storage-bucket-access-update__request-body-schema).
	Acl pulumi.StringPtrOutput `pulumi:"acl"`
	// The cert used by this Object Storage Bucket.
	Cert ObjectStorageBucketCertPtrOutput `pulumi:"cert"`
	// The cluster of the Linode Object Storage Bucket.
	Cluster pulumi.StringOutput `pulumi:"cluster"`
	// If true, the bucket will have CORS enabled for all origins.
	CorsEnabled pulumi.BoolPtrOutput `pulumi:"corsEnabled"`
	// The hostname where this bucket can be accessed. This hostname can be accessed through a browser if the bucket is made
	// public.
	Hostname pulumi.StringOutput `pulumi:"hostname"`
	// The label of the Linode Object Storage Bucket.
	Label pulumi.StringOutput `pulumi:"label"`
	// Lifecycle rules to be applied to the bucket.
	LifecycleRules ObjectStorageBucketLifecycleRuleArrayOutput `pulumi:"lifecycleRules"`
	// The secret key to authenticate with.
	SecretKey pulumi.StringPtrOutput `pulumi:"secretKey"`
	// Whether to enable versioning. Once you version-enable a bucket, it can never return to an unversioned state. You can, however, suspend versioning on that bucket. (Requires `accessKey` and `secretKey`)
	//
	// * `lifecycleRule` - (Optional) Lifecycle rules to be applied to the bucket. (Requires `accessKey` and `secretKey`)
	//
	// * `cert` - (Optional) The bucket's TLS/SSL certificate.
	Versioning pulumi.BoolOutput `pulumi:"versioning"`
}

// NewObjectStorageBucket registers a new resource with the given unique name, arguments, and options.
func NewObjectStorageBucket(ctx *pulumi.Context,
	name string, args *ObjectStorageBucketArgs, opts ...pulumi.ResourceOption) (*ObjectStorageBucket, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Cluster == nil {
		return nil, errors.New("invalid value for required argument 'Cluster'")
	}
	if args.Label == nil {
		return nil, errors.New("invalid value for required argument 'Label'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ObjectStorageBucket
	err := ctx.RegisterResource("linode:index/objectStorageBucket:ObjectStorageBucket", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetObjectStorageBucket gets an existing ObjectStorageBucket resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetObjectStorageBucket(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ObjectStorageBucketState, opts ...pulumi.ResourceOption) (*ObjectStorageBucket, error) {
	var resource ObjectStorageBucket
	err := ctx.ReadResource("linode:index/objectStorageBucket:ObjectStorageBucket", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ObjectStorageBucket resources.
type objectStorageBucketState struct {
	// The access key to authenticate with.
	AccessKey *string `pulumi:"accessKey"`
	// The Access Control Level of the bucket using a canned ACL string. See all ACL strings [in the Linode API v4 documentation](https://linode.com/docs/api/object-storage/#object-storage-bucket-access-update__request-body-schema).
	Acl *string `pulumi:"acl"`
	// The cert used by this Object Storage Bucket.
	Cert *ObjectStorageBucketCert `pulumi:"cert"`
	// The cluster of the Linode Object Storage Bucket.
	Cluster *string `pulumi:"cluster"`
	// If true, the bucket will have CORS enabled for all origins.
	CorsEnabled *bool `pulumi:"corsEnabled"`
	// The hostname where this bucket can be accessed. This hostname can be accessed through a browser if the bucket is made
	// public.
	Hostname *string `pulumi:"hostname"`
	// The label of the Linode Object Storage Bucket.
	Label *string `pulumi:"label"`
	// Lifecycle rules to be applied to the bucket.
	LifecycleRules []ObjectStorageBucketLifecycleRule `pulumi:"lifecycleRules"`
	// The secret key to authenticate with.
	SecretKey *string `pulumi:"secretKey"`
	// Whether to enable versioning. Once you version-enable a bucket, it can never return to an unversioned state. You can, however, suspend versioning on that bucket. (Requires `accessKey` and `secretKey`)
	//
	// * `lifecycleRule` - (Optional) Lifecycle rules to be applied to the bucket. (Requires `accessKey` and `secretKey`)
	//
	// * `cert` - (Optional) The bucket's TLS/SSL certificate.
	Versioning *bool `pulumi:"versioning"`
}

type ObjectStorageBucketState struct {
	// The access key to authenticate with.
	AccessKey pulumi.StringPtrInput
	// The Access Control Level of the bucket using a canned ACL string. See all ACL strings [in the Linode API v4 documentation](https://linode.com/docs/api/object-storage/#object-storage-bucket-access-update__request-body-schema).
	Acl pulumi.StringPtrInput
	// The cert used by this Object Storage Bucket.
	Cert ObjectStorageBucketCertPtrInput
	// The cluster of the Linode Object Storage Bucket.
	Cluster pulumi.StringPtrInput
	// If true, the bucket will have CORS enabled for all origins.
	CorsEnabled pulumi.BoolPtrInput
	// The hostname where this bucket can be accessed. This hostname can be accessed through a browser if the bucket is made
	// public.
	Hostname pulumi.StringPtrInput
	// The label of the Linode Object Storage Bucket.
	Label pulumi.StringPtrInput
	// Lifecycle rules to be applied to the bucket.
	LifecycleRules ObjectStorageBucketLifecycleRuleArrayInput
	// The secret key to authenticate with.
	SecretKey pulumi.StringPtrInput
	// Whether to enable versioning. Once you version-enable a bucket, it can never return to an unversioned state. You can, however, suspend versioning on that bucket. (Requires `accessKey` and `secretKey`)
	//
	// * `lifecycleRule` - (Optional) Lifecycle rules to be applied to the bucket. (Requires `accessKey` and `secretKey`)
	//
	// * `cert` - (Optional) The bucket's TLS/SSL certificate.
	Versioning pulumi.BoolPtrInput
}

func (ObjectStorageBucketState) ElementType() reflect.Type {
	return reflect.TypeOf((*objectStorageBucketState)(nil)).Elem()
}

type objectStorageBucketArgs struct {
	// The access key to authenticate with.
	AccessKey *string `pulumi:"accessKey"`
	// The Access Control Level of the bucket using a canned ACL string. See all ACL strings [in the Linode API v4 documentation](https://linode.com/docs/api/object-storage/#object-storage-bucket-access-update__request-body-schema).
	Acl *string `pulumi:"acl"`
	// The cert used by this Object Storage Bucket.
	Cert *ObjectStorageBucketCert `pulumi:"cert"`
	// The cluster of the Linode Object Storage Bucket.
	Cluster string `pulumi:"cluster"`
	// If true, the bucket will have CORS enabled for all origins.
	CorsEnabled *bool `pulumi:"corsEnabled"`
	// The label of the Linode Object Storage Bucket.
	Label string `pulumi:"label"`
	// Lifecycle rules to be applied to the bucket.
	LifecycleRules []ObjectStorageBucketLifecycleRule `pulumi:"lifecycleRules"`
	// The secret key to authenticate with.
	SecretKey *string `pulumi:"secretKey"`
	// Whether to enable versioning. Once you version-enable a bucket, it can never return to an unversioned state. You can, however, suspend versioning on that bucket. (Requires `accessKey` and `secretKey`)
	//
	// * `lifecycleRule` - (Optional) Lifecycle rules to be applied to the bucket. (Requires `accessKey` and `secretKey`)
	//
	// * `cert` - (Optional) The bucket's TLS/SSL certificate.
	Versioning *bool `pulumi:"versioning"`
}

// The set of arguments for constructing a ObjectStorageBucket resource.
type ObjectStorageBucketArgs struct {
	// The access key to authenticate with.
	AccessKey pulumi.StringPtrInput
	// The Access Control Level of the bucket using a canned ACL string. See all ACL strings [in the Linode API v4 documentation](https://linode.com/docs/api/object-storage/#object-storage-bucket-access-update__request-body-schema).
	Acl pulumi.StringPtrInput
	// The cert used by this Object Storage Bucket.
	Cert ObjectStorageBucketCertPtrInput
	// The cluster of the Linode Object Storage Bucket.
	Cluster pulumi.StringInput
	// If true, the bucket will have CORS enabled for all origins.
	CorsEnabled pulumi.BoolPtrInput
	// The label of the Linode Object Storage Bucket.
	Label pulumi.StringInput
	// Lifecycle rules to be applied to the bucket.
	LifecycleRules ObjectStorageBucketLifecycleRuleArrayInput
	// The secret key to authenticate with.
	SecretKey pulumi.StringPtrInput
	// Whether to enable versioning. Once you version-enable a bucket, it can never return to an unversioned state. You can, however, suspend versioning on that bucket. (Requires `accessKey` and `secretKey`)
	//
	// * `lifecycleRule` - (Optional) Lifecycle rules to be applied to the bucket. (Requires `accessKey` and `secretKey`)
	//
	// * `cert` - (Optional) The bucket's TLS/SSL certificate.
	Versioning pulumi.BoolPtrInput
}

func (ObjectStorageBucketArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*objectStorageBucketArgs)(nil)).Elem()
}

type ObjectStorageBucketInput interface {
	pulumi.Input

	ToObjectStorageBucketOutput() ObjectStorageBucketOutput
	ToObjectStorageBucketOutputWithContext(ctx context.Context) ObjectStorageBucketOutput
}

func (*ObjectStorageBucket) ElementType() reflect.Type {
	return reflect.TypeOf((**ObjectStorageBucket)(nil)).Elem()
}

func (i *ObjectStorageBucket) ToObjectStorageBucketOutput() ObjectStorageBucketOutput {
	return i.ToObjectStorageBucketOutputWithContext(context.Background())
}

func (i *ObjectStorageBucket) ToObjectStorageBucketOutputWithContext(ctx context.Context) ObjectStorageBucketOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ObjectStorageBucketOutput)
}

func (i *ObjectStorageBucket) ToOutput(ctx context.Context) pulumix.Output[*ObjectStorageBucket] {
	return pulumix.Output[*ObjectStorageBucket]{
		OutputState: i.ToObjectStorageBucketOutputWithContext(ctx).OutputState,
	}
}

// ObjectStorageBucketArrayInput is an input type that accepts ObjectStorageBucketArray and ObjectStorageBucketArrayOutput values.
// You can construct a concrete instance of `ObjectStorageBucketArrayInput` via:
//
//	ObjectStorageBucketArray{ ObjectStorageBucketArgs{...} }
type ObjectStorageBucketArrayInput interface {
	pulumi.Input

	ToObjectStorageBucketArrayOutput() ObjectStorageBucketArrayOutput
	ToObjectStorageBucketArrayOutputWithContext(context.Context) ObjectStorageBucketArrayOutput
}

type ObjectStorageBucketArray []ObjectStorageBucketInput

func (ObjectStorageBucketArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ObjectStorageBucket)(nil)).Elem()
}

func (i ObjectStorageBucketArray) ToObjectStorageBucketArrayOutput() ObjectStorageBucketArrayOutput {
	return i.ToObjectStorageBucketArrayOutputWithContext(context.Background())
}

func (i ObjectStorageBucketArray) ToObjectStorageBucketArrayOutputWithContext(ctx context.Context) ObjectStorageBucketArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ObjectStorageBucketArrayOutput)
}

func (i ObjectStorageBucketArray) ToOutput(ctx context.Context) pulumix.Output[[]*ObjectStorageBucket] {
	return pulumix.Output[[]*ObjectStorageBucket]{
		OutputState: i.ToObjectStorageBucketArrayOutputWithContext(ctx).OutputState,
	}
}

// ObjectStorageBucketMapInput is an input type that accepts ObjectStorageBucketMap and ObjectStorageBucketMapOutput values.
// You can construct a concrete instance of `ObjectStorageBucketMapInput` via:
//
//	ObjectStorageBucketMap{ "key": ObjectStorageBucketArgs{...} }
type ObjectStorageBucketMapInput interface {
	pulumi.Input

	ToObjectStorageBucketMapOutput() ObjectStorageBucketMapOutput
	ToObjectStorageBucketMapOutputWithContext(context.Context) ObjectStorageBucketMapOutput
}

type ObjectStorageBucketMap map[string]ObjectStorageBucketInput

func (ObjectStorageBucketMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ObjectStorageBucket)(nil)).Elem()
}

func (i ObjectStorageBucketMap) ToObjectStorageBucketMapOutput() ObjectStorageBucketMapOutput {
	return i.ToObjectStorageBucketMapOutputWithContext(context.Background())
}

func (i ObjectStorageBucketMap) ToObjectStorageBucketMapOutputWithContext(ctx context.Context) ObjectStorageBucketMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ObjectStorageBucketMapOutput)
}

func (i ObjectStorageBucketMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*ObjectStorageBucket] {
	return pulumix.Output[map[string]*ObjectStorageBucket]{
		OutputState: i.ToObjectStorageBucketMapOutputWithContext(ctx).OutputState,
	}
}

type ObjectStorageBucketOutput struct{ *pulumi.OutputState }

func (ObjectStorageBucketOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ObjectStorageBucket)(nil)).Elem()
}

func (o ObjectStorageBucketOutput) ToObjectStorageBucketOutput() ObjectStorageBucketOutput {
	return o
}

func (o ObjectStorageBucketOutput) ToObjectStorageBucketOutputWithContext(ctx context.Context) ObjectStorageBucketOutput {
	return o
}

func (o ObjectStorageBucketOutput) ToOutput(ctx context.Context) pulumix.Output[*ObjectStorageBucket] {
	return pulumix.Output[*ObjectStorageBucket]{
		OutputState: o.OutputState,
	}
}

// The access key to authenticate with.
func (o ObjectStorageBucketOutput) AccessKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ObjectStorageBucket) pulumi.StringPtrOutput { return v.AccessKey }).(pulumi.StringPtrOutput)
}

// The Access Control Level of the bucket using a canned ACL string. See all ACL strings [in the Linode API v4 documentation](https://linode.com/docs/api/object-storage/#object-storage-bucket-access-update__request-body-schema).
func (o ObjectStorageBucketOutput) Acl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ObjectStorageBucket) pulumi.StringPtrOutput { return v.Acl }).(pulumi.StringPtrOutput)
}

// The cert used by this Object Storage Bucket.
func (o ObjectStorageBucketOutput) Cert() ObjectStorageBucketCertPtrOutput {
	return o.ApplyT(func(v *ObjectStorageBucket) ObjectStorageBucketCertPtrOutput { return v.Cert }).(ObjectStorageBucketCertPtrOutput)
}

// The cluster of the Linode Object Storage Bucket.
func (o ObjectStorageBucketOutput) Cluster() pulumi.StringOutput {
	return o.ApplyT(func(v *ObjectStorageBucket) pulumi.StringOutput { return v.Cluster }).(pulumi.StringOutput)
}

// If true, the bucket will have CORS enabled for all origins.
func (o ObjectStorageBucketOutput) CorsEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ObjectStorageBucket) pulumi.BoolPtrOutput { return v.CorsEnabled }).(pulumi.BoolPtrOutput)
}

// The hostname where this bucket can be accessed. This hostname can be accessed through a browser if the bucket is made
// public.
func (o ObjectStorageBucketOutput) Hostname() pulumi.StringOutput {
	return o.ApplyT(func(v *ObjectStorageBucket) pulumi.StringOutput { return v.Hostname }).(pulumi.StringOutput)
}

// The label of the Linode Object Storage Bucket.
func (o ObjectStorageBucketOutput) Label() pulumi.StringOutput {
	return o.ApplyT(func(v *ObjectStorageBucket) pulumi.StringOutput { return v.Label }).(pulumi.StringOutput)
}

// Lifecycle rules to be applied to the bucket.
func (o ObjectStorageBucketOutput) LifecycleRules() ObjectStorageBucketLifecycleRuleArrayOutput {
	return o.ApplyT(func(v *ObjectStorageBucket) ObjectStorageBucketLifecycleRuleArrayOutput { return v.LifecycleRules }).(ObjectStorageBucketLifecycleRuleArrayOutput)
}

// The secret key to authenticate with.
func (o ObjectStorageBucketOutput) SecretKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ObjectStorageBucket) pulumi.StringPtrOutput { return v.SecretKey }).(pulumi.StringPtrOutput)
}

// Whether to enable versioning. Once you version-enable a bucket, it can never return to an unversioned state. You can, however, suspend versioning on that bucket. (Requires `accessKey` and `secretKey`)
//
// * `lifecycleRule` - (Optional) Lifecycle rules to be applied to the bucket. (Requires `accessKey` and `secretKey`)
//
// * `cert` - (Optional) The bucket's TLS/SSL certificate.
func (o ObjectStorageBucketOutput) Versioning() pulumi.BoolOutput {
	return o.ApplyT(func(v *ObjectStorageBucket) pulumi.BoolOutput { return v.Versioning }).(pulumi.BoolOutput)
}

type ObjectStorageBucketArrayOutput struct{ *pulumi.OutputState }

func (ObjectStorageBucketArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ObjectStorageBucket)(nil)).Elem()
}

func (o ObjectStorageBucketArrayOutput) ToObjectStorageBucketArrayOutput() ObjectStorageBucketArrayOutput {
	return o
}

func (o ObjectStorageBucketArrayOutput) ToObjectStorageBucketArrayOutputWithContext(ctx context.Context) ObjectStorageBucketArrayOutput {
	return o
}

func (o ObjectStorageBucketArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*ObjectStorageBucket] {
	return pulumix.Output[[]*ObjectStorageBucket]{
		OutputState: o.OutputState,
	}
}

func (o ObjectStorageBucketArrayOutput) Index(i pulumi.IntInput) ObjectStorageBucketOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ObjectStorageBucket {
		return vs[0].([]*ObjectStorageBucket)[vs[1].(int)]
	}).(ObjectStorageBucketOutput)
}

type ObjectStorageBucketMapOutput struct{ *pulumi.OutputState }

func (ObjectStorageBucketMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ObjectStorageBucket)(nil)).Elem()
}

func (o ObjectStorageBucketMapOutput) ToObjectStorageBucketMapOutput() ObjectStorageBucketMapOutput {
	return o
}

func (o ObjectStorageBucketMapOutput) ToObjectStorageBucketMapOutputWithContext(ctx context.Context) ObjectStorageBucketMapOutput {
	return o
}

func (o ObjectStorageBucketMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*ObjectStorageBucket] {
	return pulumix.Output[map[string]*ObjectStorageBucket]{
		OutputState: o.OutputState,
	}
}

func (o ObjectStorageBucketMapOutput) MapIndex(k pulumi.StringInput) ObjectStorageBucketOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ObjectStorageBucket {
		return vs[0].(map[string]*ObjectStorageBucket)[vs[1].(string)]
	}).(ObjectStorageBucketOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ObjectStorageBucketInput)(nil)).Elem(), &ObjectStorageBucket{})
	pulumi.RegisterInputType(reflect.TypeOf((*ObjectStorageBucketArrayInput)(nil)).Elem(), ObjectStorageBucketArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ObjectStorageBucketMapInput)(nil)).Elem(), ObjectStorageBucketMap{})
	pulumi.RegisterOutputType(ObjectStorageBucketOutput{})
	pulumi.RegisterOutputType(ObjectStorageBucketArrayOutput{})
	pulumi.RegisterOutputType(ObjectStorageBucketMapOutput{})
}
