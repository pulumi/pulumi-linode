// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides information about Linode Database Backups that match a set of filters.
func GetDatabaseBackups(ctx *pulumi.Context, args *GetDatabaseBackupsArgs, opts ...pulumi.InvokeOption) (*GetDatabaseBackupsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetDatabaseBackupsResult
	err := ctx.Invoke("linode:index/getDatabaseBackups:getDatabaseBackups", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDatabaseBackups.
type GetDatabaseBackupsArgs struct {
	Backups []GetDatabaseBackupsBackup `pulumi:"backups"`
	// The ID of the database to retrieve backups for.
	DatabaseId int `pulumi:"databaseId"`
	// The type of the database to retrieve backups for. (`mysql`, `postgresql`)
	DatabaseType string                     `pulumi:"databaseType"`
	Filters      []GetDatabaseBackupsFilter `pulumi:"filters"`
	// If true, only the latest backup will be returned.
	//
	// * `filter` - (Optional) A set of filters used to select database backups that meet certain requirements.
	Latest *bool `pulumi:"latest"`
	// The order in which results should be returned. (`asc`, `desc`; default `asc`)
	Order *string `pulumi:"order"`
	// The attribute to order the results by. (`created`)
	OrderBy *string `pulumi:"orderBy"`
}

// A collection of values returned by getDatabaseBackups.
type GetDatabaseBackupsResult struct {
	Backups      []GetDatabaseBackupsBackup `pulumi:"backups"`
	DatabaseId   int                        `pulumi:"databaseId"`
	DatabaseType string                     `pulumi:"databaseType"`
	Filters      []GetDatabaseBackupsFilter `pulumi:"filters"`
	// The ID of the database backup object.
	Id      int     `pulumi:"id"`
	Latest  *bool   `pulumi:"latest"`
	Order   *string `pulumi:"order"`
	OrderBy *string `pulumi:"orderBy"`
}

func GetDatabaseBackupsOutput(ctx *pulumi.Context, args GetDatabaseBackupsOutputArgs, opts ...pulumi.InvokeOption) GetDatabaseBackupsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetDatabaseBackupsResult, error) {
			args := v.(GetDatabaseBackupsArgs)
			r, err := GetDatabaseBackups(ctx, &args, opts...)
			var s GetDatabaseBackupsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetDatabaseBackupsResultOutput)
}

// A collection of arguments for invoking getDatabaseBackups.
type GetDatabaseBackupsOutputArgs struct {
	Backups GetDatabaseBackupsBackupArrayInput `pulumi:"backups"`
	// The ID of the database to retrieve backups for.
	DatabaseId pulumi.IntInput `pulumi:"databaseId"`
	// The type of the database to retrieve backups for. (`mysql`, `postgresql`)
	DatabaseType pulumi.StringInput                 `pulumi:"databaseType"`
	Filters      GetDatabaseBackupsFilterArrayInput `pulumi:"filters"`
	// If true, only the latest backup will be returned.
	//
	// * `filter` - (Optional) A set of filters used to select database backups that meet certain requirements.
	Latest pulumi.BoolPtrInput `pulumi:"latest"`
	// The order in which results should be returned. (`asc`, `desc`; default `asc`)
	Order pulumi.StringPtrInput `pulumi:"order"`
	// The attribute to order the results by. (`created`)
	OrderBy pulumi.StringPtrInput `pulumi:"orderBy"`
}

func (GetDatabaseBackupsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDatabaseBackupsArgs)(nil)).Elem()
}

// A collection of values returned by getDatabaseBackups.
type GetDatabaseBackupsResultOutput struct{ *pulumi.OutputState }

func (GetDatabaseBackupsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDatabaseBackupsResult)(nil)).Elem()
}

func (o GetDatabaseBackupsResultOutput) ToGetDatabaseBackupsResultOutput() GetDatabaseBackupsResultOutput {
	return o
}

func (o GetDatabaseBackupsResultOutput) ToGetDatabaseBackupsResultOutputWithContext(ctx context.Context) GetDatabaseBackupsResultOutput {
	return o
}

func (o GetDatabaseBackupsResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetDatabaseBackupsResult] {
	return pulumix.Output[GetDatabaseBackupsResult]{
		OutputState: o.OutputState,
	}
}

func (o GetDatabaseBackupsResultOutput) Backups() GetDatabaseBackupsBackupArrayOutput {
	return o.ApplyT(func(v GetDatabaseBackupsResult) []GetDatabaseBackupsBackup { return v.Backups }).(GetDatabaseBackupsBackupArrayOutput)
}

func (o GetDatabaseBackupsResultOutput) DatabaseId() pulumi.IntOutput {
	return o.ApplyT(func(v GetDatabaseBackupsResult) int { return v.DatabaseId }).(pulumi.IntOutput)
}

func (o GetDatabaseBackupsResultOutput) DatabaseType() pulumi.StringOutput {
	return o.ApplyT(func(v GetDatabaseBackupsResult) string { return v.DatabaseType }).(pulumi.StringOutput)
}

func (o GetDatabaseBackupsResultOutput) Filters() GetDatabaseBackupsFilterArrayOutput {
	return o.ApplyT(func(v GetDatabaseBackupsResult) []GetDatabaseBackupsFilter { return v.Filters }).(GetDatabaseBackupsFilterArrayOutput)
}

// The ID of the database backup object.
func (o GetDatabaseBackupsResultOutput) Id() pulumi.IntOutput {
	return o.ApplyT(func(v GetDatabaseBackupsResult) int { return v.Id }).(pulumi.IntOutput)
}

func (o GetDatabaseBackupsResultOutput) Latest() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetDatabaseBackupsResult) *bool { return v.Latest }).(pulumi.BoolPtrOutput)
}

func (o GetDatabaseBackupsResultOutput) Order() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDatabaseBackupsResult) *string { return v.Order }).(pulumi.StringPtrOutput)
}

func (o GetDatabaseBackupsResultOutput) OrderBy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDatabaseBackupsResult) *string { return v.OrderBy }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDatabaseBackupsResultOutput{})
}
