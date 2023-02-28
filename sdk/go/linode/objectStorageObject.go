// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Linode Object Storage Object resource. This can be used to create, modify, and delete Linodes Object Storage Objects for Buckets.
//
// ## Example Usage
// ### Uploading plaintext to a bucket
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
//			_, err := linode.NewObjectStorageObject(ctx, "object", &linode.ObjectStorageObjectArgs{
//				Bucket:          pulumi.String("my-bucket"),
//				Cluster:         pulumi.String("us-east-1"),
//				Key:             pulumi.String("my-object"),
//				SecretKey:       pulumi.Any(linode_object_storage_key.My_key.Secret_key),
//				AccessKey:       pulumi.Any(linode_object_storage_key.My_key.Access_key),
//				Content:         pulumi.String("This is the content of the Object..."),
//				ContentType:     pulumi.String("text/plain"),
//				ContentLanguage: pulumi.String("en"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type ObjectStorageObject struct {
	pulumi.CustomResourceState

	// The access key to authenticate with.
	AccessKey pulumi.StringOutput `pulumi:"accessKey"`
	// The canned ACL to apply. (`private`, `public-read`, `authenticated-read`, `public-read-write`, `custom`) (defaults to `private`).
	Acl pulumi.StringPtrOutput `pulumi:"acl"`
	// The name of the bucket to put the object in.
	Bucket pulumi.StringOutput `pulumi:"bucket"`
	// Specifies caching behavior along the request/reply chain Read [w3c cacheControl](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
	CacheControl pulumi.StringPtrOutput `pulumi:"cacheControl"`
	// The cluster the bucket is in.
	Cluster pulumi.StringOutput `pulumi:"cluster"`
	// Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
	Content pulumi.StringPtrOutput `pulumi:"content"`
	// Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
	ContentBase64 pulumi.StringPtrOutput `pulumi:"contentBase64"`
	// Specifies presentational information for the object. Read [w3c contentDisposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
	ContentDisposition pulumi.StringPtrOutput `pulumi:"contentDisposition"`
	// Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
	ContentEncoding pulumi.StringPtrOutput `pulumi:"contentEncoding"`
	// The language the content is in e.g. en-US or en-GB.
	ContentLanguage pulumi.StringPtrOutput `pulumi:"contentLanguage"`
	// A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
	ContentType pulumi.StringOutput `pulumi:"contentType"`
	// The specific version of this object.
	Etag pulumi.StringOutput `pulumi:"etag"`
	// Allow the object to be deleted regardless of any legal hold or object lock (defaults to `false`).
	ForceDestroy pulumi.BoolPtrOutput `pulumi:"forceDestroy"`
	// They name of the object once it is in the bucket.
	Key pulumi.StringOutput `pulumi:"key"`
	// A map of keys/values to provision metadata.
	Metadata pulumi.StringMapOutput `pulumi:"metadata"`
	// The secret key to authenitcate with.
	SecretKey pulumi.StringOutput `pulumi:"secretKey"`
	// The path to a file that will be read and uploaded as raw bytes for the object content. The path must either be relative to the root module or absolute.
	Source pulumi.StringPtrOutput `pulumi:"source"`
	// A unique version ID value for the object.
	VersionId pulumi.StringOutput `pulumi:"versionId"`
	// Specifies a target URL for website redirect.
	WebsiteRedirect pulumi.StringPtrOutput `pulumi:"websiteRedirect"`
}

// NewObjectStorageObject registers a new resource with the given unique name, arguments, and options.
func NewObjectStorageObject(ctx *pulumi.Context,
	name string, args *ObjectStorageObjectArgs, opts ...pulumi.ResourceOption) (*ObjectStorageObject, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccessKey == nil {
		return nil, errors.New("invalid value for required argument 'AccessKey'")
	}
	if args.Bucket == nil {
		return nil, errors.New("invalid value for required argument 'Bucket'")
	}
	if args.Cluster == nil {
		return nil, errors.New("invalid value for required argument 'Cluster'")
	}
	if args.Key == nil {
		return nil, errors.New("invalid value for required argument 'Key'")
	}
	if args.SecretKey == nil {
		return nil, errors.New("invalid value for required argument 'SecretKey'")
	}
	var resource ObjectStorageObject
	err := ctx.RegisterResource("linode:index/objectStorageObject:ObjectStorageObject", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetObjectStorageObject gets an existing ObjectStorageObject resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetObjectStorageObject(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ObjectStorageObjectState, opts ...pulumi.ResourceOption) (*ObjectStorageObject, error) {
	var resource ObjectStorageObject
	err := ctx.ReadResource("linode:index/objectStorageObject:ObjectStorageObject", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ObjectStorageObject resources.
type objectStorageObjectState struct {
	// The access key to authenticate with.
	AccessKey *string `pulumi:"accessKey"`
	// The canned ACL to apply. (`private`, `public-read`, `authenticated-read`, `public-read-write`, `custom`) (defaults to `private`).
	Acl *string `pulumi:"acl"`
	// The name of the bucket to put the object in.
	Bucket *string `pulumi:"bucket"`
	// Specifies caching behavior along the request/reply chain Read [w3c cacheControl](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
	CacheControl *string `pulumi:"cacheControl"`
	// The cluster the bucket is in.
	Cluster *string `pulumi:"cluster"`
	// Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
	Content *string `pulumi:"content"`
	// Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
	ContentBase64 *string `pulumi:"contentBase64"`
	// Specifies presentational information for the object. Read [w3c contentDisposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
	ContentDisposition *string `pulumi:"contentDisposition"`
	// Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
	ContentEncoding *string `pulumi:"contentEncoding"`
	// The language the content is in e.g. en-US or en-GB.
	ContentLanguage *string `pulumi:"contentLanguage"`
	// A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
	ContentType *string `pulumi:"contentType"`
	// The specific version of this object.
	Etag *string `pulumi:"etag"`
	// Allow the object to be deleted regardless of any legal hold or object lock (defaults to `false`).
	ForceDestroy *bool `pulumi:"forceDestroy"`
	// They name of the object once it is in the bucket.
	Key *string `pulumi:"key"`
	// A map of keys/values to provision metadata.
	Metadata map[string]string `pulumi:"metadata"`
	// The secret key to authenitcate with.
	SecretKey *string `pulumi:"secretKey"`
	// The path to a file that will be read and uploaded as raw bytes for the object content. The path must either be relative to the root module or absolute.
	Source *string `pulumi:"source"`
	// A unique version ID value for the object.
	VersionId *string `pulumi:"versionId"`
	// Specifies a target URL for website redirect.
	WebsiteRedirect *string `pulumi:"websiteRedirect"`
}

type ObjectStorageObjectState struct {
	// The access key to authenticate with.
	AccessKey pulumi.StringPtrInput
	// The canned ACL to apply. (`private`, `public-read`, `authenticated-read`, `public-read-write`, `custom`) (defaults to `private`).
	Acl pulumi.StringPtrInput
	// The name of the bucket to put the object in.
	Bucket pulumi.StringPtrInput
	// Specifies caching behavior along the request/reply chain Read [w3c cacheControl](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
	CacheControl pulumi.StringPtrInput
	// The cluster the bucket is in.
	Cluster pulumi.StringPtrInput
	// Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
	Content pulumi.StringPtrInput
	// Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
	ContentBase64 pulumi.StringPtrInput
	// Specifies presentational information for the object. Read [w3c contentDisposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
	ContentDisposition pulumi.StringPtrInput
	// Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
	ContentEncoding pulumi.StringPtrInput
	// The language the content is in e.g. en-US or en-GB.
	ContentLanguage pulumi.StringPtrInput
	// A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
	ContentType pulumi.StringPtrInput
	// The specific version of this object.
	Etag pulumi.StringPtrInput
	// Allow the object to be deleted regardless of any legal hold or object lock (defaults to `false`).
	ForceDestroy pulumi.BoolPtrInput
	// They name of the object once it is in the bucket.
	Key pulumi.StringPtrInput
	// A map of keys/values to provision metadata.
	Metadata pulumi.StringMapInput
	// The secret key to authenitcate with.
	SecretKey pulumi.StringPtrInput
	// The path to a file that will be read and uploaded as raw bytes for the object content. The path must either be relative to the root module or absolute.
	Source pulumi.StringPtrInput
	// A unique version ID value for the object.
	VersionId pulumi.StringPtrInput
	// Specifies a target URL for website redirect.
	WebsiteRedirect pulumi.StringPtrInput
}

func (ObjectStorageObjectState) ElementType() reflect.Type {
	return reflect.TypeOf((*objectStorageObjectState)(nil)).Elem()
}

type objectStorageObjectArgs struct {
	// The access key to authenticate with.
	AccessKey string `pulumi:"accessKey"`
	// The canned ACL to apply. (`private`, `public-read`, `authenticated-read`, `public-read-write`, `custom`) (defaults to `private`).
	Acl *string `pulumi:"acl"`
	// The name of the bucket to put the object in.
	Bucket string `pulumi:"bucket"`
	// Specifies caching behavior along the request/reply chain Read [w3c cacheControl](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
	CacheControl *string `pulumi:"cacheControl"`
	// The cluster the bucket is in.
	Cluster string `pulumi:"cluster"`
	// Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
	Content *string `pulumi:"content"`
	// Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
	ContentBase64 *string `pulumi:"contentBase64"`
	// Specifies presentational information for the object. Read [w3c contentDisposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
	ContentDisposition *string `pulumi:"contentDisposition"`
	// Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
	ContentEncoding *string `pulumi:"contentEncoding"`
	// The language the content is in e.g. en-US or en-GB.
	ContentLanguage *string `pulumi:"contentLanguage"`
	// A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
	ContentType *string `pulumi:"contentType"`
	// The specific version of this object.
	Etag *string `pulumi:"etag"`
	// Allow the object to be deleted regardless of any legal hold or object lock (defaults to `false`).
	ForceDestroy *bool `pulumi:"forceDestroy"`
	// They name of the object once it is in the bucket.
	Key string `pulumi:"key"`
	// A map of keys/values to provision metadata.
	Metadata map[string]string `pulumi:"metadata"`
	// The secret key to authenitcate with.
	SecretKey string `pulumi:"secretKey"`
	// The path to a file that will be read and uploaded as raw bytes for the object content. The path must either be relative to the root module or absolute.
	Source *string `pulumi:"source"`
	// Specifies a target URL for website redirect.
	WebsiteRedirect *string `pulumi:"websiteRedirect"`
}

// The set of arguments for constructing a ObjectStorageObject resource.
type ObjectStorageObjectArgs struct {
	// The access key to authenticate with.
	AccessKey pulumi.StringInput
	// The canned ACL to apply. (`private`, `public-read`, `authenticated-read`, `public-read-write`, `custom`) (defaults to `private`).
	Acl pulumi.StringPtrInput
	// The name of the bucket to put the object in.
	Bucket pulumi.StringInput
	// Specifies caching behavior along the request/reply chain Read [w3c cacheControl](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
	CacheControl pulumi.StringPtrInput
	// The cluster the bucket is in.
	Cluster pulumi.StringInput
	// Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
	Content pulumi.StringPtrInput
	// Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
	ContentBase64 pulumi.StringPtrInput
	// Specifies presentational information for the object. Read [w3c contentDisposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
	ContentDisposition pulumi.StringPtrInput
	// Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
	ContentEncoding pulumi.StringPtrInput
	// The language the content is in e.g. en-US or en-GB.
	ContentLanguage pulumi.StringPtrInput
	// A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
	ContentType pulumi.StringPtrInput
	// The specific version of this object.
	Etag pulumi.StringPtrInput
	// Allow the object to be deleted regardless of any legal hold or object lock (defaults to `false`).
	ForceDestroy pulumi.BoolPtrInput
	// They name of the object once it is in the bucket.
	Key pulumi.StringInput
	// A map of keys/values to provision metadata.
	Metadata pulumi.StringMapInput
	// The secret key to authenitcate with.
	SecretKey pulumi.StringInput
	// The path to a file that will be read and uploaded as raw bytes for the object content. The path must either be relative to the root module or absolute.
	Source pulumi.StringPtrInput
	// Specifies a target URL for website redirect.
	WebsiteRedirect pulumi.StringPtrInput
}

func (ObjectStorageObjectArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*objectStorageObjectArgs)(nil)).Elem()
}

type ObjectStorageObjectInput interface {
	pulumi.Input

	ToObjectStorageObjectOutput() ObjectStorageObjectOutput
	ToObjectStorageObjectOutputWithContext(ctx context.Context) ObjectStorageObjectOutput
}

func (*ObjectStorageObject) ElementType() reflect.Type {
	return reflect.TypeOf((**ObjectStorageObject)(nil)).Elem()
}

func (i *ObjectStorageObject) ToObjectStorageObjectOutput() ObjectStorageObjectOutput {
	return i.ToObjectStorageObjectOutputWithContext(context.Background())
}

func (i *ObjectStorageObject) ToObjectStorageObjectOutputWithContext(ctx context.Context) ObjectStorageObjectOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ObjectStorageObjectOutput)
}

// ObjectStorageObjectArrayInput is an input type that accepts ObjectStorageObjectArray and ObjectStorageObjectArrayOutput values.
// You can construct a concrete instance of `ObjectStorageObjectArrayInput` via:
//
//	ObjectStorageObjectArray{ ObjectStorageObjectArgs{...} }
type ObjectStorageObjectArrayInput interface {
	pulumi.Input

	ToObjectStorageObjectArrayOutput() ObjectStorageObjectArrayOutput
	ToObjectStorageObjectArrayOutputWithContext(context.Context) ObjectStorageObjectArrayOutput
}

type ObjectStorageObjectArray []ObjectStorageObjectInput

func (ObjectStorageObjectArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ObjectStorageObject)(nil)).Elem()
}

func (i ObjectStorageObjectArray) ToObjectStorageObjectArrayOutput() ObjectStorageObjectArrayOutput {
	return i.ToObjectStorageObjectArrayOutputWithContext(context.Background())
}

func (i ObjectStorageObjectArray) ToObjectStorageObjectArrayOutputWithContext(ctx context.Context) ObjectStorageObjectArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ObjectStorageObjectArrayOutput)
}

// ObjectStorageObjectMapInput is an input type that accepts ObjectStorageObjectMap and ObjectStorageObjectMapOutput values.
// You can construct a concrete instance of `ObjectStorageObjectMapInput` via:
//
//	ObjectStorageObjectMap{ "key": ObjectStorageObjectArgs{...} }
type ObjectStorageObjectMapInput interface {
	pulumi.Input

	ToObjectStorageObjectMapOutput() ObjectStorageObjectMapOutput
	ToObjectStorageObjectMapOutputWithContext(context.Context) ObjectStorageObjectMapOutput
}

type ObjectStorageObjectMap map[string]ObjectStorageObjectInput

func (ObjectStorageObjectMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ObjectStorageObject)(nil)).Elem()
}

func (i ObjectStorageObjectMap) ToObjectStorageObjectMapOutput() ObjectStorageObjectMapOutput {
	return i.ToObjectStorageObjectMapOutputWithContext(context.Background())
}

func (i ObjectStorageObjectMap) ToObjectStorageObjectMapOutputWithContext(ctx context.Context) ObjectStorageObjectMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ObjectStorageObjectMapOutput)
}

type ObjectStorageObjectOutput struct{ *pulumi.OutputState }

func (ObjectStorageObjectOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ObjectStorageObject)(nil)).Elem()
}

func (o ObjectStorageObjectOutput) ToObjectStorageObjectOutput() ObjectStorageObjectOutput {
	return o
}

func (o ObjectStorageObjectOutput) ToObjectStorageObjectOutputWithContext(ctx context.Context) ObjectStorageObjectOutput {
	return o
}

// The access key to authenticate with.
func (o ObjectStorageObjectOutput) AccessKey() pulumi.StringOutput {
	return o.ApplyT(func(v *ObjectStorageObject) pulumi.StringOutput { return v.AccessKey }).(pulumi.StringOutput)
}

// The canned ACL to apply. (`private`, `public-read`, `authenticated-read`, `public-read-write`, `custom`) (defaults to `private`).
func (o ObjectStorageObjectOutput) Acl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ObjectStorageObject) pulumi.StringPtrOutput { return v.Acl }).(pulumi.StringPtrOutput)
}

// The name of the bucket to put the object in.
func (o ObjectStorageObjectOutput) Bucket() pulumi.StringOutput {
	return o.ApplyT(func(v *ObjectStorageObject) pulumi.StringOutput { return v.Bucket }).(pulumi.StringOutput)
}

// Specifies caching behavior along the request/reply chain Read [w3c cacheControl](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
func (o ObjectStorageObjectOutput) CacheControl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ObjectStorageObject) pulumi.StringPtrOutput { return v.CacheControl }).(pulumi.StringPtrOutput)
}

// The cluster the bucket is in.
func (o ObjectStorageObjectOutput) Cluster() pulumi.StringOutput {
	return o.ApplyT(func(v *ObjectStorageObject) pulumi.StringOutput { return v.Cluster }).(pulumi.StringOutput)
}

// Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
func (o ObjectStorageObjectOutput) Content() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ObjectStorageObject) pulumi.StringPtrOutput { return v.Content }).(pulumi.StringPtrOutput)
}

// Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
func (o ObjectStorageObjectOutput) ContentBase64() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ObjectStorageObject) pulumi.StringPtrOutput { return v.ContentBase64 }).(pulumi.StringPtrOutput)
}

// Specifies presentational information for the object. Read [w3c contentDisposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
func (o ObjectStorageObjectOutput) ContentDisposition() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ObjectStorageObject) pulumi.StringPtrOutput { return v.ContentDisposition }).(pulumi.StringPtrOutput)
}

// Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
func (o ObjectStorageObjectOutput) ContentEncoding() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ObjectStorageObject) pulumi.StringPtrOutput { return v.ContentEncoding }).(pulumi.StringPtrOutput)
}

// The language the content is in e.g. en-US or en-GB.
func (o ObjectStorageObjectOutput) ContentLanguage() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ObjectStorageObject) pulumi.StringPtrOutput { return v.ContentLanguage }).(pulumi.StringPtrOutput)
}

// A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
func (o ObjectStorageObjectOutput) ContentType() pulumi.StringOutput {
	return o.ApplyT(func(v *ObjectStorageObject) pulumi.StringOutput { return v.ContentType }).(pulumi.StringOutput)
}

// The specific version of this object.
func (o ObjectStorageObjectOutput) Etag() pulumi.StringOutput {
	return o.ApplyT(func(v *ObjectStorageObject) pulumi.StringOutput { return v.Etag }).(pulumi.StringOutput)
}

// Allow the object to be deleted regardless of any legal hold or object lock (defaults to `false`).
func (o ObjectStorageObjectOutput) ForceDestroy() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ObjectStorageObject) pulumi.BoolPtrOutput { return v.ForceDestroy }).(pulumi.BoolPtrOutput)
}

// They name of the object once it is in the bucket.
func (o ObjectStorageObjectOutput) Key() pulumi.StringOutput {
	return o.ApplyT(func(v *ObjectStorageObject) pulumi.StringOutput { return v.Key }).(pulumi.StringOutput)
}

// A map of keys/values to provision metadata.
func (o ObjectStorageObjectOutput) Metadata() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ObjectStorageObject) pulumi.StringMapOutput { return v.Metadata }).(pulumi.StringMapOutput)
}

// The secret key to authenitcate with.
func (o ObjectStorageObjectOutput) SecretKey() pulumi.StringOutput {
	return o.ApplyT(func(v *ObjectStorageObject) pulumi.StringOutput { return v.SecretKey }).(pulumi.StringOutput)
}

// The path to a file that will be read and uploaded as raw bytes for the object content. The path must either be relative to the root module or absolute.
func (o ObjectStorageObjectOutput) Source() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ObjectStorageObject) pulumi.StringPtrOutput { return v.Source }).(pulumi.StringPtrOutput)
}

// A unique version ID value for the object.
func (o ObjectStorageObjectOutput) VersionId() pulumi.StringOutput {
	return o.ApplyT(func(v *ObjectStorageObject) pulumi.StringOutput { return v.VersionId }).(pulumi.StringOutput)
}

// Specifies a target URL for website redirect.
func (o ObjectStorageObjectOutput) WebsiteRedirect() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ObjectStorageObject) pulumi.StringPtrOutput { return v.WebsiteRedirect }).(pulumi.StringPtrOutput)
}

type ObjectStorageObjectArrayOutput struct{ *pulumi.OutputState }

func (ObjectStorageObjectArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ObjectStorageObject)(nil)).Elem()
}

func (o ObjectStorageObjectArrayOutput) ToObjectStorageObjectArrayOutput() ObjectStorageObjectArrayOutput {
	return o
}

func (o ObjectStorageObjectArrayOutput) ToObjectStorageObjectArrayOutputWithContext(ctx context.Context) ObjectStorageObjectArrayOutput {
	return o
}

func (o ObjectStorageObjectArrayOutput) Index(i pulumi.IntInput) ObjectStorageObjectOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ObjectStorageObject {
		return vs[0].([]*ObjectStorageObject)[vs[1].(int)]
	}).(ObjectStorageObjectOutput)
}

type ObjectStorageObjectMapOutput struct{ *pulumi.OutputState }

func (ObjectStorageObjectMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ObjectStorageObject)(nil)).Elem()
}

func (o ObjectStorageObjectMapOutput) ToObjectStorageObjectMapOutput() ObjectStorageObjectMapOutput {
	return o
}

func (o ObjectStorageObjectMapOutput) ToObjectStorageObjectMapOutputWithContext(ctx context.Context) ObjectStorageObjectMapOutput {
	return o
}

func (o ObjectStorageObjectMapOutput) MapIndex(k pulumi.StringInput) ObjectStorageObjectOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ObjectStorageObject {
		return vs[0].(map[string]*ObjectStorageObject)[vs[1].(string)]
	}).(ObjectStorageObjectOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ObjectStorageObjectInput)(nil)).Elem(), &ObjectStorageObject{})
	pulumi.RegisterInputType(reflect.TypeOf((*ObjectStorageObjectArrayInput)(nil)).Elem(), ObjectStorageObjectArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ObjectStorageObjectMapInput)(nil)).Elem(), ObjectStorageObjectMap{})
	pulumi.RegisterOutputType(ObjectStorageObjectOutput{})
	pulumi.RegisterOutputType(ObjectStorageObjectArrayOutput{})
	pulumi.RegisterOutputType(ObjectStorageObjectMapOutput{})
}
