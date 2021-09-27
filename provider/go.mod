module github.com/pulumi/pulumi-linode/provider/v3

go 1.16

require (
	github.com/hashicorp/terraform-plugin-sdk v1.11.0 // indirect
	github.com/linode/terraform-provider-linode v1.11.0
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.6.0
	github.com/pulumi/pulumi/pkg/v3 v3.11.0
	github.com/pulumi/pulumi/sdk/v3 v3.11.0
)

replace (
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20210629210550-59d24255d71f
	github.com/linode/terraform-provider-linode => github.com/pulumi/terraform-provider-linode v1.11.2-0.20210922132539-b24fd02fc081
)
