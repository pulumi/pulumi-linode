// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about Linode Managed Database engines that match a set of filters.
//
// ## Example Usage
//
// Get information about all Linode Managed Database engines:
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-linode/sdk/v3/go/linode"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := linode.GetDatabaseEngines(ctx, nil, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// Get information about all Linode MySQL Database engines:
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-linode/sdk/v3/go/linode"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := linode.GetDatabaseEngines(ctx, &GetDatabaseEnginesArgs{
// 			Filters: []GetDatabaseEnginesFilter{
// 				GetDatabaseEnginesFilter{
// 					Name: "engine",
// 					Values: []string{
// 						"mysql",
// 					},
// 				},
// 			},
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// Create a Linode MySQL Database using the latest support MySQL version:
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-linode/sdk/v3/go/linode"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		mysql, err := linode.GetDatabaseEngines(ctx, &GetDatabaseEnginesArgs{
// 			Latest: pulumi.BoolRef(true),
// 			Filters: []GetDatabaseEnginesFilter{
// 				GetDatabaseEnginesFilter{
// 					Name: "engine",
// 					Values: []string{
// 						"mysql",
// 					},
// 				},
// 			},
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = linode.NewDatabaseMysql(ctx, "myDb", &linode.DatabaseMysqlArgs{
// 			Label:    pulumi.String("mydb"),
// 			EngineId: pulumi.String(mysql.Engines[0].Id),
// 			Region:   pulumi.String("us-southeast"),
// 			Type:     pulumi.String("g6-nanode-1"),
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
// Each engine will be stored in the `engines` attribute and will export the following attributes:
//
// * `engine` - The Managed Database engine type.
//
// * `id` - The Managed Database engine ID in engine/version format.
//
// * `version` - The Managed Database engine version.
func GetDatabaseEngines(ctx *pulumi.Context, args *GetDatabaseEnginesArgs, opts ...pulumi.InvokeOption) (*GetDatabaseEnginesResult, error) {
	var rv GetDatabaseEnginesResult
	err := ctx.Invoke("linode:index/getDatabaseEngines:getDatabaseEngines", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDatabaseEngines.
type GetDatabaseEnginesArgs struct {
	Filters []GetDatabaseEnginesFilter `pulumi:"filters"`
	// If true, only the latest engine version will be returned.
	Latest *bool `pulumi:"latest"`
	// The order in which results should be returned. (`asc`, `desc`; default `asc`)
	Order *string `pulumi:"order"`
	// The attribute to order the results by. (`version`)
	OrderBy *string `pulumi:"orderBy"`
}

// A collection of values returned by getDatabaseEngines.
type GetDatabaseEnginesResult struct {
	Engines []GetDatabaseEnginesEngine `pulumi:"engines"`
	Filters []GetDatabaseEnginesFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id      string  `pulumi:"id"`
	Latest  *bool   `pulumi:"latest"`
	Order   *string `pulumi:"order"`
	OrderBy *string `pulumi:"orderBy"`
}

func GetDatabaseEnginesOutput(ctx *pulumi.Context, args GetDatabaseEnginesOutputArgs, opts ...pulumi.InvokeOption) GetDatabaseEnginesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetDatabaseEnginesResult, error) {
			args := v.(GetDatabaseEnginesArgs)
			r, err := GetDatabaseEngines(ctx, &args, opts...)
			var s GetDatabaseEnginesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetDatabaseEnginesResultOutput)
}

// A collection of arguments for invoking getDatabaseEngines.
type GetDatabaseEnginesOutputArgs struct {
	Filters GetDatabaseEnginesFilterArrayInput `pulumi:"filters"`
	// If true, only the latest engine version will be returned.
	Latest pulumi.BoolPtrInput `pulumi:"latest"`
	// The order in which results should be returned. (`asc`, `desc`; default `asc`)
	Order pulumi.StringPtrInput `pulumi:"order"`
	// The attribute to order the results by. (`version`)
	OrderBy pulumi.StringPtrInput `pulumi:"orderBy"`
}

func (GetDatabaseEnginesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDatabaseEnginesArgs)(nil)).Elem()
}

// A collection of values returned by getDatabaseEngines.
type GetDatabaseEnginesResultOutput struct{ *pulumi.OutputState }

func (GetDatabaseEnginesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDatabaseEnginesResult)(nil)).Elem()
}

func (o GetDatabaseEnginesResultOutput) ToGetDatabaseEnginesResultOutput() GetDatabaseEnginesResultOutput {
	return o
}

func (o GetDatabaseEnginesResultOutput) ToGetDatabaseEnginesResultOutputWithContext(ctx context.Context) GetDatabaseEnginesResultOutput {
	return o
}

func (o GetDatabaseEnginesResultOutput) Engines() GetDatabaseEnginesEngineArrayOutput {
	return o.ApplyT(func(v GetDatabaseEnginesResult) []GetDatabaseEnginesEngine { return v.Engines }).(GetDatabaseEnginesEngineArrayOutput)
}

func (o GetDatabaseEnginesResultOutput) Filters() GetDatabaseEnginesFilterArrayOutput {
	return o.ApplyT(func(v GetDatabaseEnginesResult) []GetDatabaseEnginesFilter { return v.Filters }).(GetDatabaseEnginesFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetDatabaseEnginesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDatabaseEnginesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetDatabaseEnginesResultOutput) Latest() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetDatabaseEnginesResult) *bool { return v.Latest }).(pulumi.BoolPtrOutput)
}

func (o GetDatabaseEnginesResultOutput) Order() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDatabaseEnginesResult) *string { return v.Order }).(pulumi.StringPtrOutput)
}

func (o GetDatabaseEnginesResultOutput) OrderBy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDatabaseEnginesResult) *string { return v.OrderBy }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDatabaseEnginesResultOutput{})
}
