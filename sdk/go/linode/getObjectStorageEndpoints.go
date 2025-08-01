// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-linode/sdk/v5/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about Linode Object Storage endpoints available to the user.
// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-object-storage-endpoints).
//
// ## Example Usage
//
// Get an endpoint of E3 type (highest performance and capacity) of Linode Object Storage services:
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-linode/sdk/v5/go/linode"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			test, err := linode.GetObjectStorageEndpoints(ctx, &linode.GetObjectStorageEndpointsArgs{
//				Filters: []linode.GetObjectStorageEndpointsFilter{
//					{
//						Name: "endpoint_type",
//						Values: []string{
//							"E3",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("high-performance-obj-endpoint", test.Endpoints[0].S3Endpoint)
//			return nil
//		})
//	}
//
// ```
//
// Get a list of all available endpoints of Linode Object Storage services.
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-linode/sdk/v5/go/linode"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			test, err := linode.GetObjectStorageEndpoints(ctx, &linode.GetObjectStorageEndpointsArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("available-endpoints", test.Endpoints)
//			return nil
//		})
//	}
//
// ```
//
// ## Filterable Fields
//
// * `endpointType`
//
// * `region`
//
// * `s3Endpoint`
func GetObjectStorageEndpoints(ctx *pulumi.Context, args *GetObjectStorageEndpointsArgs, opts ...pulumi.InvokeOption) (*GetObjectStorageEndpointsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetObjectStorageEndpointsResult
	err := ctx.Invoke("linode:index/getObjectStorageEndpoints:getObjectStorageEndpoints", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getObjectStorageEndpoints.
type GetObjectStorageEndpointsArgs struct {
	Endpoints []GetObjectStorageEndpointsEndpoint `pulumi:"endpoints"`
	Filters   []GetObjectStorageEndpointsFilter   `pulumi:"filters"`
	// The order in which results should be returned. (`asc`, `desc`; default `asc`)
	Order *string `pulumi:"order"`
	// The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
	OrderBy *string `pulumi:"orderBy"`
}

// A collection of values returned by getObjectStorageEndpoints.
type GetObjectStorageEndpointsResult struct {
	Endpoints []GetObjectStorageEndpointsEndpoint `pulumi:"endpoints"`
	Filters   []GetObjectStorageEndpointsFilter   `pulumi:"filters"`
	Id        string                              `pulumi:"id"`
	Order     *string                             `pulumi:"order"`
	OrderBy   *string                             `pulumi:"orderBy"`
}

func GetObjectStorageEndpointsOutput(ctx *pulumi.Context, args GetObjectStorageEndpointsOutputArgs, opts ...pulumi.InvokeOption) GetObjectStorageEndpointsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetObjectStorageEndpointsResultOutput, error) {
			args := v.(GetObjectStorageEndpointsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("linode:index/getObjectStorageEndpoints:getObjectStorageEndpoints", args, GetObjectStorageEndpointsResultOutput{}, options).(GetObjectStorageEndpointsResultOutput), nil
		}).(GetObjectStorageEndpointsResultOutput)
}

// A collection of arguments for invoking getObjectStorageEndpoints.
type GetObjectStorageEndpointsOutputArgs struct {
	Endpoints GetObjectStorageEndpointsEndpointArrayInput `pulumi:"endpoints"`
	Filters   GetObjectStorageEndpointsFilterArrayInput   `pulumi:"filters"`
	// The order in which results should be returned. (`asc`, `desc`; default `asc`)
	Order pulumi.StringPtrInput `pulumi:"order"`
	// The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
	OrderBy pulumi.StringPtrInput `pulumi:"orderBy"`
}

func (GetObjectStorageEndpointsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetObjectStorageEndpointsArgs)(nil)).Elem()
}

// A collection of values returned by getObjectStorageEndpoints.
type GetObjectStorageEndpointsResultOutput struct{ *pulumi.OutputState }

func (GetObjectStorageEndpointsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetObjectStorageEndpointsResult)(nil)).Elem()
}

func (o GetObjectStorageEndpointsResultOutput) ToGetObjectStorageEndpointsResultOutput() GetObjectStorageEndpointsResultOutput {
	return o
}

func (o GetObjectStorageEndpointsResultOutput) ToGetObjectStorageEndpointsResultOutputWithContext(ctx context.Context) GetObjectStorageEndpointsResultOutput {
	return o
}

func (o GetObjectStorageEndpointsResultOutput) Endpoints() GetObjectStorageEndpointsEndpointArrayOutput {
	return o.ApplyT(func(v GetObjectStorageEndpointsResult) []GetObjectStorageEndpointsEndpoint { return v.Endpoints }).(GetObjectStorageEndpointsEndpointArrayOutput)
}

func (o GetObjectStorageEndpointsResultOutput) Filters() GetObjectStorageEndpointsFilterArrayOutput {
	return o.ApplyT(func(v GetObjectStorageEndpointsResult) []GetObjectStorageEndpointsFilter { return v.Filters }).(GetObjectStorageEndpointsFilterArrayOutput)
}

func (o GetObjectStorageEndpointsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetObjectStorageEndpointsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetObjectStorageEndpointsResultOutput) Order() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetObjectStorageEndpointsResult) *string { return v.Order }).(pulumi.StringPtrOutput)
}

func (o GetObjectStorageEndpointsResultOutput) OrderBy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetObjectStorageEndpointsResult) *string { return v.OrderBy }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetObjectStorageEndpointsResultOutput{})
}
